package nju.edu.dataservice.transferdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.ArriverorderPO;
import PO.LoadorderPO;

public interface ReceiveDataService extends Remote{
	
	//�����ݿ��в���һ����ת���ĵ��ﵥ��PO
	public void insert(ArriverorderPO ap)throws RemoteException;
	//�������в��Ҷ�Ӧ��δ���յ�װ�˵�
	public LoadorderPO checkUnreceive_loadorderPO(String s)throws RemoteException;
	
}
