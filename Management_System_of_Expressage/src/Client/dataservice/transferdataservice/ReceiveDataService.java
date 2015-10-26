package Client.dataservice.transferdataservice;

import java.rmi.RemoteException;

import Client.PO.ArriverorderPO;

public interface ReceiveDataService {
	
	//在数据库中插入一个中转中心到达单的PO
	public void insert(ArriverorderPO ap)throws RemoteException;
}
