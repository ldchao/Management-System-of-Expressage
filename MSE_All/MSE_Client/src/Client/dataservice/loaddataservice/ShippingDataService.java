package Client.dataservice.loaddataservice;

import java.rmi.RemoteException;

import PO.LoadorderPO;

public interface ShippingDataService {
	//�����ݿ��в���һ��װ�˵�PO
	public void insert(LoadorderPO lp)throws RemoteException;
}
