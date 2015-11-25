package nju.edu.data.listindata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import PO.OrderPO;
import State.ResultMessage;
import nju.edu.dataservice.listindataservice.ListinDataService;

public class ListinData extends UnicastRemoteObject implements ListinDataService{

	public ListinData() throws RemoteException{
		// TODO Auto-generated constructor stub
	}
	@Override
	public void insert(OrderPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getPrice(String address1, String address2) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResultMessage find(String number) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public OrderPO getOrder(String id) throws RemoteException {
		return null;
		// TODO Auto-generated method stub
		
	}

}
