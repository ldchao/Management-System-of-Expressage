package nju.edu.data.listindata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import PO.ArriverorderPO;
import PO.LoadorderPO;
import nju.edu.dataservice.transferdataservice.ReceiveDataService;

public class ReceiverinData extends UnicastRemoteObject implements ReceiveDataService{
	 
	public ReceiverinData() throws RemoteException{
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void insert(ArriverorderPO ap) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LoadorderPO checkUnreceive_loadorderPO(String s) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
