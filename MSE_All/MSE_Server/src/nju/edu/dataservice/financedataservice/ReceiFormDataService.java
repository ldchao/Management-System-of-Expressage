package nju.edu.dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.PayeeorderPO;

public interface ReceiFormDataService extends Remote{
	
	//�½��տ
	public void insert(PayeeorderPO po) throws RemoteException;

}
