package Server.dataservice.transferdataservice;

import java.rmi.RemoteException;

import PO.ChangeorderPO;

public interface TransferDataService {
	
	//�����ݿ��в���һ����ת��PO
	public void insert(ChangeorderPO cp)throws RemoteException;
}
