package nju.edu.dataservice.storedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.StoreoutorderPO;

public interface Warehouse_outDataService extends Remote{

	//�����ݿ��в���һ�����ⵥPO
	public void insert(StoreoutorderPO sp)throws RemoteException;
}
