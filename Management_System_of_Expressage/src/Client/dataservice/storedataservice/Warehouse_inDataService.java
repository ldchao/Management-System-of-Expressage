package Client.dataservice.storedataservice;

import java.rmi.RemoteException;

import Client.PO.StoreinorderPO;

public interface Warehouse_inDataService {
	
	//�����ݿ��в���һ����ⵥPO
	public void insert(StoreinorderPO sp)throws RemoteException;
}
