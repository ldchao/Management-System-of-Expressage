package nju.edu.dataservice.storedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.StoreinorderPO;

public interface Warehouse_inDataService extends Remote {

	// �����ݿ��в���һ����ⵥPO
	public void insert(StoreinorderPO sp) throws RemoteException;
	
	//�õ�δ��������ⵥ
	public ArrayList<String> get() throws RemoteException;

	// �鿴δ���ĵ��ﵥ
	public ArrayList<String> checkUnstoreinArriveorder() throws RemoteException;

	// ���δ��⵽�ﵥ��Ϣ����
	public void deleteRemind() throws RemoteException;

	// ���ݶ����鿴��Ӧ�Ŀ��λ��
	public String[] getLocation(String id) throws RemoteException;
}
