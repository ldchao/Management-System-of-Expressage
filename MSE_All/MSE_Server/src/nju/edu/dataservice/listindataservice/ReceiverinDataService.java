package nju.edu.dataservice.listindataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import Client.PO.ReceiverPO;
import State.ResultMessage;

public interface ReceiverinDataService extends Remote{
	public void insertReceiver(ReceiverPO po)throws RemoteException;
	
	public boolean find(String number)throws RemoteException;
}
