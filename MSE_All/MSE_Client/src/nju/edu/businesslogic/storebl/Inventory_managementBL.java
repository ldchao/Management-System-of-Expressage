package nju.edu.businesslogic.storebl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.OrganizationNumPO;
import nju.edu.ExcelWriter.ExcelWriter;
import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.StoreinVO;
import nju.edu.businesslogicservice.storeblservice.Inventory_managementBLService;
import nju.edu.businesslogicservice.storeblservice.Inventory_managementInfo;
import nju.edu.dataservice.storedataservice.Inventory_managementDataService;

public class Inventory_managementBL implements Inventory_managementBLService{

	int store_num;
	

	//查看指定仓库在指定时间段内的出入库数量
	@Override
	public String[][] checkInventory(String startdate, String overdate) {
		Inventory_managementDataService imd=RMIHelper.getInventory_managementData();
		String[][] inventoryMessage=new String[4][3];
		inventoryMessage[0][0]="航运区";
		inventoryMessage[1][0]="铁运区";
		inventoryMessage[2][0]="汽运区";
		inventoryMessage[3][0]="合计";
		int[][] number={{0,0},{0,0},{0,0},{0,0}};
		
		try {
			ArrayList<String> StoreinorderList=imd.checkStoreinNumber(startdate, overdate);
			for (String s:StoreinorderList) {
				if(s.equals("航运区")){
					number[0][0]++;
				}else if(s.equals("铁运区")){
					number[1][0]++;
				}else{
					number[2][0]++;
				}
			}
			ArrayList<String> StoreoutorderList=imd.checkStoreoutNumber(startdate, overdate);
			for (String s:StoreinorderList) {
				if(s.equals("航运区")){
					number[0][1]++;
				}else if(s.equals("铁运区")){
					number[1][1]++;
				}else{
					number[2][1]++;
				}
			}
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				number[3][i]+=number[j][i];
			}			
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				inventoryMessage[i][j+1]=""+number[i][j];
			}
		}
		return inventoryMessage;
	}

	
	// 查看指定仓库的指定区域当前所有库存的商品的订单信息
	@Override
	public String[][] checkInventoryOrder(String qu) {
		OrganizationNumPO op=new OrganizationNumPO();
		Inventory_managementInfo im=StoreMessageBL.getInstance();
		ArrayList<String> orderlist=im.getOrderList(qu);
		Inventory_managementDataService imd=RMIHelper.getInventory_managementData();
		String[][] ordermessage=null;
		try {
			ArrayList<String> storeinorderList=imd.checkorder(orderlist);
			ordermessage=new String[storeinorderList.size()][7];
			int i=-1;
			for (String s:storeinorderList) {
				String[] c=s.split(";");
				i++;
				for (int j = 0; j < 7; j++) {
					ordermessage[i][j]=c[j];
				}
				ordermessage[i][2]=op.getName(c[2]);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return ordermessage;
	}
	//将指定仓库的指定区域当前所有库存的商品的订单信息输出到excel表
	@Override
	public void InventoryOrderToExcel(String qu) {
		String[][] ordermessage=checkInventoryOrder(qu);
		ArrayList<String> orderlist=new ArrayList<>();
		String header="快递编号,入库日期,目的地,区号,排号,架号,位号";
		orderlist.add(header);
		for (int i = 0; i < ordermessage.length; i++) {
			String s=ordermessage[i][0]+","+ordermessage[i][1]+","+ordermessage[i][2]+","
		 +ordermessage[i][3]+","+ordermessage[i][4]+","+ordermessage[i][5]+","+ordermessage[i][6];
			orderlist.add(s);
		}
		ExcelWriter.Writer("InventoryMessage.txt", orderlist);
	}

	
	@Override
	public String getWarnData() {
		Inventory_managementInfo im=StoreMessageBL.getInstance();		
		return im.getWarnData();
	}

	@Override
	public void setWarnData(String warnData) {
		Inventory_managementInfo im=StoreMessageBL.getInstance();		
		im.setWarnData(warnData);
	}

	@Override
	public String getRemindData(int area) {
		Inventory_managementInfo im=StoreMessageBL.getInstance();	
		return im.getRemindData(area);
	}

	@Override
	public void setRemindData(int area, String RemindData) {
		Inventory_managementInfo im=StoreMessageBL.getInstance();
		im.setRemindData(area, RemindData);
		
	}

}
