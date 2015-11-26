package nju.edu.data.listindata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import Client.PO.ReceiverPO;
import PO.ArriverorderPO;
import PO.LoadorderPO;
import State.ResultMessage;
import nju.edu.dataservice.listindataservice.ReceiverinDataService;
import nju.edu.dataservice.transferdataservice.ReceiveDataService;

public class ReceiverinData extends UnicastRemoteObject implements ReceiverinDataService{
	 
	public ReceiverinData() throws RemoteException{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insertReceiver(ReceiverPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ResultMessage find(String number) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
