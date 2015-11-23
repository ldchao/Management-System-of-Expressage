package Client.dataservice.transferdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.ChangeorderPO;

public interface TransferDataService extends Remote{
	
	//在数据库中插入一个中转单PO
	public void insert(ChangeorderPO cp)throws RemoteException;
}
