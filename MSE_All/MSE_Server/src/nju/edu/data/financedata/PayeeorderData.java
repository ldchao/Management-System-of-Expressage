package nju.edu.data.financedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import PO.PayeeorderPO;
import nju.edu.dataservice.financedataservice.ReceiFormDataService;

public class PayeeorderData extends UnicastRemoteObject implements ReceiFormDataService{

	protected PayeeorderData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insert(PayeeorderPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
