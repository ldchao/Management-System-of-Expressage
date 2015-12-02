package nju.edu.businesslogic.storebl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.StoreinVO;
import nju.edu.businesslogicservice.storeblservice.Warehouse_inBLService;
import nju.edu.businesslogicservice.transferblservice.StoreinInfo;
import nju.edu.dataservice.storedataservice.Warehouse_inDataService;
import PO.OrganizationNumPO;
import PO.StoreinorderPO;
import State.ApproveState;

public class Warehouse_inBL implements Warehouse_inBLService,StoreinInfo{
	

	
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

	////根据库位得到对应位置的订单编号
	@Override
	public ArrayList<String> getId(int[][][][] location) {
		// TODO Auto-generated method stub
		ArrayList<String> Idlist=new ArrayList<String> ();
		
		return Idlist;
	}

	private void update(){
		
		//在save中调用，更新订单物流信息以及仓库各个位置库存信息
	}

	
	
}
