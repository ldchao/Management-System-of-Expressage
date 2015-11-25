package nju.edu.data.checklistdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import PO.OrderPO;
import nju.edu.dataservice.checklistdataservice.ListinDataService;

public class ChecklistData extends UnicastRemoteObject implements ListinDataService{

	protected ChecklistData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public OrderPO find(String id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
