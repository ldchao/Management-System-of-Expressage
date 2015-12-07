package nju.edu.data.storedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.data.FileIO.fileReader;
import nju.edu.dataservice.storedataservice.Inventory_managementDataService;
import PO.OrderPO;
import PO.StorePO;

public class Inventory_managementData extends UnicastRemoteObject implements Inventory_managementDataService{

	public Inventory_managementData() throws RemoteException {
		super();
		
	}
	// 查看指定仓库指定时间段内入库量
	@Override
	public ArrayList<String> checkStoreinNumber(String startdata,
			String overdata) throws RemoteException {
		ArrayList<String> allStoreinorderList=fileReader.Reader("DataBase/Storeinorder.txt");
		ArrayList<String> quList=new ArrayList<String>();
		String[] Storeinorder;
		for (String s:allStoreinorderList) {
			Storeinorder=s.split(";");
			if(isValue(Storeinorder[1], startdata, overdata)){
				quList.add(Storeinorder[3]);
			}
		}
		return quList;
	}
	// 查看指定仓库指定时间段内出库量
	@Override
	public ArrayList<String> checkStoreoutNumber(String startdata,
			String overdata) throws RemoteException {
		ArrayList<String> allStoreoutorderList=fileReader.Reader("DataBase/Storeoutorder.txt");
		ArrayList<String> quList=new ArrayList<String>();
		String[] Storeoutorder;
		for (String s:allStoreoutorderList) {
			Storeoutorder=s.split(";");
			if(isValue(Storeoutorder[1], startdata, overdata)){
				quList.add(Storeoutorder[3]+"区");
			}
		}
		return quList;
	}
	// 根据订单号查找入库单
	@Override
	public ArrayList<String> checkorder(ArrayList<String> orderNum) throws RemoteException {
		ArrayList<String> allStoreinorderList=fileReader.Reader("DataBase/NeedOutStoreinorder.txt");
		ArrayList<String> StoreinorderList=new ArrayList<String>();
		for(String orderid:orderNum){
			for(String storeinOrder:allStoreinorderList){
				if(storeinOrder.startsWith(orderid)){
					StoreinorderList.add(storeinOrder);
					break;
				}
			}
		}
		return StoreinorderList;
	}
	
	private boolean isValue(String date,String startdata,String overdata){
		int a=changeToDouble(date);
		int m=changeToDouble(startdata);
		int n=changeToDouble(overdata);
		
		if(a>=m&&a<=n){
			return true;
		}		
		return false;
	}
	private int changeToDouble(String date){
		String[] s=date.split("-");
		String combingDate=s[0]+s[1]+s[2];
		int valueofDate=Integer.parseInt(combingDate);
		return valueofDate;
	}

}
