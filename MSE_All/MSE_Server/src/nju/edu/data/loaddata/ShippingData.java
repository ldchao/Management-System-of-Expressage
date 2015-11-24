package nju.edu.data.loaddata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.dataservice.loaddataservice.ShippingDataService;
import PO.LoadorderPO;

public class ShippingData extends UnicastRemoteObject implements ShippingDataService{

	public ShippingData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	//在数据库中插入一个装运单PO
	@Override
	public void insert(LoadorderPO lp) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
