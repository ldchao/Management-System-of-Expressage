package Client.dataservice.transferdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.ChangeorderPO;

public interface TransferDataService extends Remote{
	
	//�����ݿ��в���һ����ת��PO
	public void insert(ChangeorderPO cp)throws RemoteException;
}
