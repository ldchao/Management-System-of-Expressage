package Server.dataservice.billdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.StartinfoPO;

public interface BillDataService extends Remote{

	// �½���
	public void insert(StartinfoPO po)throws RemoteException;

	// ����������
	public ArrayList<StartinfoPO> find()throws RemoteException;
}
