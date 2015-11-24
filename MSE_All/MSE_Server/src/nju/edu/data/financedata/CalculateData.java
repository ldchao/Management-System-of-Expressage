package nju.edu.data.financedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.dataservice.financedataservice.CalculateDataService;
import PO.PayeeorderPO;

public class CalculateData extends UnicastRemoteObject implements CalculateDataService {

	public CalculateData() throws RemoteException {
		super();
	}

	@Override
	public ArrayList<PayeeorderPO> find(String data, String shop) throws RemoteException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double total(double[] payee) throws RemoteException{
		// TODO Auto-generated method stub
		return 0;
	}

}
