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
	// �鿴ָ���ֿ�ָ��ʱ����������
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
	// �鿴ָ���ֿ�ָ��ʱ����ڳ�����
	@Override
	public ArrayList<String> checkStoreoutNumber(String startdata,
			String overdata) throws RemoteException {
		ArrayList<String> allStoreoutorderList=fileReader.Reader("DataBase/Storeoutorder.txt");
		ArrayList<String> quList=new ArrayList<String>();
		String[] Storeoutorder;
		for (String s:allStoreoutorderList) {
			Storeoutorder=s.split(";");
			if(isValue(Storeoutorder[1], startdata, overdata)){
				quList.add(Storeoutorder[3]+"��");
			}
		}
		return quList;
	}
	// ���ݶ����Ų�����ⵥ
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
