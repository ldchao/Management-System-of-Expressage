package nju.edu.dataservice.loaddataservice;


import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.LoadorderPO;

public interface LoadDataService extends Remote{

	//新建装车单
	public void insert(LoadorderPO PO) throws RemoteException;

	
}
