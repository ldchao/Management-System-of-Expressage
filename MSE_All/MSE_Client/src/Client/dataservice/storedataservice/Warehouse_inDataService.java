package Client.dataservice.storedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.StoreinorderPO;

public interface Warehouse_inDataService extends Remote{
	
	//在数据库中插入一条入库单PO
	public void insert(StoreinorderPO sp)throws RemoteException;
}
