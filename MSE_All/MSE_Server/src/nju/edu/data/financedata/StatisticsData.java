package nju.edu.data.financedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.dataservice.financedataservice.StatisticsDataService;
import PO.PayeeorderPO;
import PO.PayorderPO;

@SuppressWarnings("serial")
public class StatisticsData extends UnicastRemoteObject implements StatisticsDataService{

	public StatisticsData() throws RemoteException {
		super();
	}

	@Override
	public ArrayList<PayorderPO> findPay(String start, String end) throws RemoteException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<PayeeorderPO> findPayee(String start, String end) throws RemoteException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excel(ArrayList<PayorderPO> payPo,
			ArrayList<PayeeorderPO> payeePo)throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
