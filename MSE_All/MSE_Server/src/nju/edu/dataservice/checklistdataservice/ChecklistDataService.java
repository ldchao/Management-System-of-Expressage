package nju.edu.dataservice.checklistdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.OrderPO;

public interface ChecklistDataService extends Remote{

	//��ѯ����
	public OrderPO find(String id) throws RemoteException;
}
