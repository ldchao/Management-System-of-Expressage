package nju.edu.dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.PayeeorderPO;

public interface PayeeorderDataService extends Remote{
	
	//�½��տ
	public void insert(PayeeorderPO po) throws RemoteException;

}
