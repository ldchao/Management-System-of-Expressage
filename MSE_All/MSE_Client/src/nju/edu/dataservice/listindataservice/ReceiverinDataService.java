package nju.edu.dataservice.listindataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.ReceiverPO;
import State.ResultMessage;

public interface ReceiverinDataService extends Remote{
	//�½��ռ�����Ϣ��
	public void insertReceiver(ReceiverPO po) throws RemoteException;
	
	//�����Ƿ��������Ķ�����
	public boolean find(String number)throws RemoteException;
}
