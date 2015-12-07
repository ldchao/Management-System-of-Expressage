package nju.edu.businesslogic.storebl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.tools.DocumentationTool.Location;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.StoreLocationVO;
import nju.edu.VO.StoreinVO;
import nju.edu.businesslogic.listinbl.Listinbl;
import nju.edu.businesslogicservice.listinblservice.OrderInfo;
import nju.edu.businesslogicservice.listinblservice.UpdateInfo;
import nju.edu.businesslogicservice.storeblservice.GetLocationInfo;
import nju.edu.businesslogicservice.storeblservice.StoreinUpdateInfo;
import nju.edu.businesslogicservice.storeblservice.Warehouse_inBLService;
import nju.edu.businesslogicservice.transferblservice.StoreinInfo;
import nju.edu.dataservice.storedataservice.Warehouse_inDataService;
import PO.OrganizationNumPO;
import PO.StoreinorderPO;
import State.ApproveState;

public class Warehouse_inBL implements Warehouse_inBLService,GetLocationInfo,ApproveWarehouse_inInfo{
	

	
	//新建一张入库单
	@Override
	public void build(StoreinVO sv) {
		Warehouse_inDataService wd=RMIHelper.getWarehouse_inData();
		StoreinorderPO sp=new StoreinorderPO(sv.getOrder_number(), sv.getDate(),
				sv.getOffnum(), sv.getQu(), sv.getPai(), sv.getWei(), 
				sv.getJia(), ApproveState.NotApprove);
		try {
			wd.insert(sp);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		update(sp.getOrder_number(), sp.getQu(), Integer.parseInt(sp.getPai()),
				Integer.parseInt(sp.getJia()), Integer.parseInt(sp.getWei()));
		System.out.println("入库单已提交总经理审批");
	}

	//产看提醒
	@Override
	public String checkRemind() {
		String needinstore="";
		Warehouse_inDataService wd=RMIHelper.getWarehouse_inData();
		ArrayList<String> arriveOrderList;
		OrganizationNumPO op=new OrganizationNumPO();
		try {
			arriveOrderList = wd.checkUnstoreinArriveorder();
		} catch (RemoteException e) {
			arriveOrderList =null;
			e.printStackTrace();
		}
		for(String arriverorder:arriveOrderList){
			if(arriverorder.length()!=0){
			   String[] order=arriverorder.split(";");
			   needinstore+=(order[0]+"来自"+op.getName(order[2])+"的货物需要办理入库！"+"\n");
			   }
		}		
		return needinstore;
	}
	//删除消息提醒
	@Override
	public void deleteRemind() {
		Warehouse_inDataService wd=RMIHelper.getWarehouse_inData();
		try {
			wd.deleteRemind();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}
	
	//得到未审批的入库单
	@Override
	public ArrayList<StoreinorderPO> get() {
		// TODO Auto-generated method stub
		return null;
	}

	
	//存储新建立的入库单
	@Override
	public void save(StoreinorderPO sp) {
		Warehouse_inDataService wd=RMIHelper.getWarehouse_inData();
		try {
			wd.insert(sp);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		System.out.println("存储入库单");
	}

	//根据订单号通过查找入库单的方式查找订单库存位置
	@Override
	public StoreLocationVO getLocation(String orderNum) {
		Warehouse_inDataService wd=RMIHelper.getWarehouse_inData();	
		StoreLocationVO sv=null;
		try {
			String[] location=wd.getLocation(orderNum);
			sv=new StoreLocationVO(location[0], Integer.parseInt(location[1]), Integer.parseInt(location[2]), Integer.parseInt(location[3]));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return sv;
	}
	
	//更新订单物流信息和库存信息
	private void update(String id,String qu, int pai, int jia, int wei){
		
		StoreinUpdateInfo sm=StoreMessageBL.getInstance();
		sm.storein_update(qu, pai, jia, wei, id);
		
		UpdateInfo order_update=new Listinbl();
		order_update.update(id, "订单已在该中转中心入库");
	}

	

	
	
}
