package nju.edu.dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.PayeeorderPO;

public interface ReceiFormDataService extends Remote{
	
	//新建收款单
	public void insert(PayeeorderPO po) throws RemoteException;

}
