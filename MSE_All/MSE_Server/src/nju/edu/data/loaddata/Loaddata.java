package nju.edu.data.loaddata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import PO.LoadorderPO;
import nju.edu.dataservice.loaddataservice.LoadDataService;

public class Loaddata extends UnicastRemoteObject implements LoadDataService{

	protected Loaddata() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insert(LoadorderPO PO) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(String key) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
