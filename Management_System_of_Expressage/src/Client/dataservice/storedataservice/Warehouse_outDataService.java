package Client.dataservice.storedataservice;

import java.rmi.RemoteException;

import Client.PO.StoreoutorderPO;

public interface Warehouse_outDataService {

	//�����ݿ��в���һ�����ⵥPO
	public void insert(StoreoutorderPO sp)throws RemoteException;
}
