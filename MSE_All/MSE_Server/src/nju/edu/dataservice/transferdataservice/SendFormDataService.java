package nju.edu.dataservice.transferdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.SendorderPO;

public interface SendFormDataService extends Remote {

	// �½��ɼ���
	public void insert(SendorderPO PO) throws RemoteException;

	// �õ�δ�������ɼ���
	public ArrayList<String> get() throws RemoteException;

}
