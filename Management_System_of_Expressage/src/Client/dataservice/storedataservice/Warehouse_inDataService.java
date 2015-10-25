package Client.dataservice.storedataservice;

import java.rmi.RemoteException;

import Client.PO.StoreinorderPO;

public interface Warehouse_inDataService {
	
	//在数据库中插入一条入库单PO
	public void insert(StoreinorderPO sp)throws RemoteException;
}
