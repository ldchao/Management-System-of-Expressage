package nju.edu.dataservice.storedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.OrderPO;
import PO.StorePO;

public interface Inventory_managementDataService extends Remote{

	// �鿴ָ���ֿ�ָ��ʱ����������
	public ArrayList<String> checkStoreinNumber(String startdata, String overdata)
			throws RemoteException;

	// �鿴ָ���ֿ�ָ��ʱ����ڳ�����
	public ArrayList<String> checkStoreoutNumber(String startdata, String overdata)
			throws RemoteException;
	
	// ���ݶ����Ų�����ⵥ
	public ArrayList<String> checkorder(ArrayList<String> orderNum) throws RemoteException;
}
