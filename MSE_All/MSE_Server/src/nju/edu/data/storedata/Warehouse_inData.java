package nju.edu.data.storedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import nju.edu.dataservice.storedataservice.Warehouse_inDataService;
import PO.StoreinorderPO;

public class Warehouse_inData extends UnicastRemoteObject implements Warehouse_inDataService{

	protected Warehouse_inData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	//�����ݿ��в���һ����ⵥPO
	@Override
	public void insert(StoreinorderPO sp) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
