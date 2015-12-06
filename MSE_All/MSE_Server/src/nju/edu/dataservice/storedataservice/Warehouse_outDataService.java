package nju.edu.dataservice.storedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.StoreoutorderPO;

public interface Warehouse_outDataService extends Remote {

	// �����ݿ��в���һ�����ⵥPO
	public void insert(StoreoutorderPO sp) throws RemoteException;

	// �鿴δ����������ת��
	public ArrayList<String> checkUnstoreoutChangeorder()
			throws RemoteException;

	// ɾ���Ѿ�����������ת��
	public void deleteChangeorder(String numOfTransfer) throws RemoteException;
}
