package Server.data.financedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import PO.PayeeorderPO;
import PO.PayorderPO;
import Server.dataservice.financedataservice.PayorderDataService;

public class PayorderData extends UnicastRemoteObject implements PayorderDataService{

	protected PayorderData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insert(PayorderPO po) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<PayorderPO> find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double[] profit(ArrayList<PayorderPO> pay,
			ArrayList<PayeeorderPO> payee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excel(String date, double income, double outcome, double benefit) {
		// TODO Auto-generated method stub
		
	}

}
