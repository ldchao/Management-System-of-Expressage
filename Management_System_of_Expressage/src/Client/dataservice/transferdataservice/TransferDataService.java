package Client.dataservice.transferdataservice;

import java.rmi.RemoteException;

import Client.PO.ChangeorderPO;

public interface TransferDataService {
	
	//�����ݿ��в���һ����ת��PO
	public void insert(ChangeorderPO cp)throws RemoteException;
}
