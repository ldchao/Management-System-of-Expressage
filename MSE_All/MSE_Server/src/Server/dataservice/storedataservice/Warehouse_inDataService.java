package Server.dataservice.storedataservice;

import java.rmi.RemoteException;

import PO.StoreinorderPO;

public interface Warehouse_inDataService {
	
	//�����ݿ��в���һ����ⵥPO
	public void insert(StoreinorderPO sp)throws RemoteException;
}
