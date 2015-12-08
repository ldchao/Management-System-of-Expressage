package nju.edu.dataservice.loaddataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.ChangeorderPO;
import PO.LoadorderPO;

public interface ShippingDataService extends Remote {
	// �����ݿ��в���һ��װ�˵�PO
	public void insert(LoadorderPO lp) throws RemoteException;
	
	//�鿴δ������װ�˵�
	public ArrayList<LoadorderPO> get() throws RemoteException;

	// ������Ҫװ�˵���ת��
	public ArrayList<String> checkUnshippingChangeorder() throws RemoteException;
	
	//ɾ���Ѿ�����װ�˹������ת��
	public void deleteChangeorder(String numOfTransfer) throws RemoteException;
}
