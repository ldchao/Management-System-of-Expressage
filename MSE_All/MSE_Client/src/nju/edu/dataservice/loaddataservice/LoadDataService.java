package nju.edu.dataservice.loaddataservice;


import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.LoadorderPO;

public interface LoadDataService extends Remote{

	//�½�װ����
	public void insert(LoadorderPO PO) throws RemoteException;

	
}
