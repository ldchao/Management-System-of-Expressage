package nju.edu.data.financedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import PO.PayeeorderPO;
import nju.edu.dataservice.financedataservice.PayeeorderDataService;

public class PayeeorderData extends UnicastRemoteObject implements PayeeorderDataService{

	protected PayeeorderData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insert(PayeeorderPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
