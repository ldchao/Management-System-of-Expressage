package Client.dataservice.loaddataservice;

import java.rmi.RemoteException;

import PO.LoadorderPO;

public interface ShippingDataService {
	//在数据库中插入一个装运单PO
	public void insert(LoadorderPO lp)throws RemoteException;
}
