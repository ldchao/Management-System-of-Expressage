package nju.edu.data.transferdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import PO.ReceiveorderPO;
import nju.edu.dataservice.transferdataservice.ReceiFormDataService;

public class ReceiFormData extends UnicastRemoteObject implements ReceiFormDataService{

	public ReceiFormData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insert(ReceiveorderPO PO) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(String key) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
