package Client.dataservice.transferdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.ArriverorderPO;

public interface ReceiveDataService extends Remote{
	
	//�����ݿ��в���һ����ת���ĵ��ﵥ��PO
	public void insert(ArriverorderPO ap)throws RemoteException;
}
