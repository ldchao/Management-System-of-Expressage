package Server.data.financedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import PO.PayeeorderPO;
import PO.PayorderPO;
import Server.dataservice.financedataservice.StatisticsDataService;

public class StatisticsData extends UnicastRemoteObject implements StatisticsDataService{

	protected StatisticsData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
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
