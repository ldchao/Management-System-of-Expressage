package Server.dataservice.loaddataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.LoadorderPO;

public interface ShippingDataService extends Remote{
	//�����ݿ��в���һ��װ�˵�PO
	public void insert(LoadorderPO lp)throws RemoteException;
}
