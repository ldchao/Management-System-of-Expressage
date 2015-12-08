package nju.edu.dataservice.transferdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.ChangeorderPO;

public interface TransferDataService extends Remote{
	
	//�����ݿ��в���һ����ת��PO
	public void insert(ChangeorderPO cp)throws RemoteException;
	
	//�õ�δ��������ת��
	public ArrayList<String> get() throws RemoteException;
}
