package Client.dataservice.transferdataservice;

import java.rmi.RemoteException;

import Client.PO.ArriverorderPO;

public interface ReceiveDataService {
	
	//�����ݿ��в���һ����ת���ĵ��ﵥ��PO
	public void insert(ArriverorderPO ap)throws RemoteException;
}
