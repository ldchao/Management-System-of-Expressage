package nju.edu.dataservice.transferdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.ReceiveorderPO;

public interface ReceiFormDataService extends Remote{

	//�½����յ�
	public void insert(ReceiveorderPO PO) throws RemoteException; 
	
	//�õ�δ�����Ľ��յ�
	public ArrayList<String> get() throws RemoteException;
	
}
