package nju.edu.data.storedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.dataservice.storedataservice.Warehouse_outDataService;
import PO.StoreoutorderPO;

public class Warehouse_outData extends UnicastRemoteObject implements  Warehouse_outDataService{

	public Warehouse_outData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	//�����ݿ��в���һ�����ⵥPO
	@Override
	public void insert(StoreoutorderPO sp) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
