package Client.dataservice.storedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.StoreinorderPO;

public interface Warehouse_inDataService extends Remote{
	
	//�����ݿ��в���һ����ⵥPO
	public void insert(StoreinorderPO sp)throws RemoteException;
}
