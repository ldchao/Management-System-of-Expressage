package nju.edu.data.transferdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import PO.SendorderPO;
import nju.edu.dataservice.transferdataservice.SendFormDataService;

public class SendFormData extends UnicastRemoteObject implements SendFormDataService{

	protected SendFormData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insert(SendorderPO PO) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(String key) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
