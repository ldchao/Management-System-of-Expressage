package nju.edu.dataservice.transferdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.ReceiveorderPO;

public interface ReceiFormDataService extends Remote{

	//�½����յ�
	public void insert(ReceiveorderPO PO) throws RemoteException;
	
	//������Ϣ��˾���������Ͷ���״̬��
	public void update(String key) throws RemoteException;
	
}
