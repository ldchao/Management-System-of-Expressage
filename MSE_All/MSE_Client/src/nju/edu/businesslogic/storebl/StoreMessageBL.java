package nju.edu.businesslogic.storebl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.businesslogicservice.storeblservice.Inventory_managementInfo;
import nju.edu.businesslogicservice.storeblservice.StoreinUpdateInfo;
import nju.edu.businesslogicservice.transferblservice.StoreinInfo;
import nju.edu.dataservice.storedataservice.StoreMessageDataService;
import PO.StorePO;
import PO.StoreinorderPO;

public class StoreMessageBL implements StoreinUpdateInfo,StoreinInfo,Inventory_managementInfo{
	
	private static StoreMessageBL store_message=null;
	private StorePO sp;

	private StoreMessageBL() {
         init();
	}

	public static StoreMessageBL getInstance() {

		if(store_message==null){
			store_message=new StoreMessageBL();
			
		}
	     return store_message;
	}

	private void init(){
		StoreMessageDataService smd=RMIHelper.getStoreMessageData();
		try {
			sp=smd.getStoreMessage();
		} catch (RemoteException e) {
			sp=null;
			e.printStackTrace();
		}
		
	}
	//将最新的库存信息存入文件中保存
	public void save(){
		StoreMessageDataService smd=RMIHelper.getStoreMessageData();
		try {
			smd.saveStoreMessage(sp);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}
	
	//入库是更新库存信息

	@Override
	public void storein_update(String qu, int pai, int jia, int wei,String orderNum) {
		sp.update(qu, pai-1, jia-1, wei-1, orderNum);		
	}

	//根据库位查找对应位置的订单编号
	@Override
	public ArrayList<String> getId(String qu, int pai, int[] jia) {
		return sp.getId(qu, pai-1, jia);
	}
    //根据库位查找对应位置的订单编号
	@Override
	public ArrayList<String> getId(int jia, int[] wei) {
		return sp.getId(jia-1, wei);
	}
	//得到各个库存位置的库存比例
	@Override
	public String[][] getStoreRatio() {	
		return sp.getStoreRatio();
	}
	
	//得到当前警戒值
	@Override
	public String getWarnData() {
		return sp.getWarn_value();
	}
	//设置警戒值
	@Override
	public void setWarnData(String warnData) {
		sp.setWarn_value(warnData);
		
	}
	//得到指定区域的提醒值
	@Override
	public String getRemindData(int area) {
		String[] remindData=sp.getRemind_value();
		return remindData[area];
	}
	//设置指定区域的提醒值
	@Override
	public void setRemindData(int area, String RemindData) {
		String[] remindData=sp.getRemind_value();
		remindData[area]=RemindData;
		sp.setRemind_value(remindData);		
	}
	//根据区域得到所有订单号
	@Override
	public ArrayList<String> getOrderList(String qu) {
		return sp.getId(qu);
	}
	
	
	
}
