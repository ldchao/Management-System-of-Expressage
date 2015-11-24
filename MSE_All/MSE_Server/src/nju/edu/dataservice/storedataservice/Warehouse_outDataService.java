package nju.edu.dataservice.storedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.StoreoutorderPO;

public interface Warehouse_outDataService extends Remote{

	//在数据库中插入一条出库单PO
	public void insert(StoreoutorderPO sp)throws RemoteException;
}
