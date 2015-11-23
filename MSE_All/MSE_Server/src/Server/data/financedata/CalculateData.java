package Server.data.financedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import PO.PayeeorderPO;
import Server.dataservice.financedataservice.CalculateDataService;

public class CalculateData extends UnicastRemoteObject implements CalculateDataService {

	protected CalculateData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
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
