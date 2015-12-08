package nju.edu.dataservice.transferdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.ArriverorderPO;
import PO.LoadorderPO;

public interface ReceiveDataService extends Remote{
	
	//�����ݿ��в���һ����ת���ĵ��ﵥ��PO
	public void insert(ArriverorderPO ap)throws RemoteException;
	
	//�鿴δ�����Ľ��յ�
	public ArrayList<String> get() throws RemoteException;
	
	//�������в��Ҷ�Ӧ��δ���յ�װ�˵�
	public LoadorderPO checkUnreceive_loadorderPO(String s)throws RemoteException;
}
