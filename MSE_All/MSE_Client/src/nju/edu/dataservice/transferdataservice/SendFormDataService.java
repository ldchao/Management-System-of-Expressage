package nju.edu.dataservice.transferdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.SendorderPO;

public interface SendFormDataService extends Remote{

	//�½��ɼ���
	public void insert(SendorderPO PO) throws RemoteException;
	
	//������Ϣ������״̬��
	public void update(String key) throws RemoteException;
	
}
