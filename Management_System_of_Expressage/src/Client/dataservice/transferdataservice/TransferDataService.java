package Client.dataservice.transferdataservice;

import java.rmi.RemoteException;

import Client.PO.ChangeorderPO;

public interface TransferDataService {
	
	//在数据库中插入一个中转单PO
	public void insert(ChangeorderPO cp)throws RemoteException;
}
