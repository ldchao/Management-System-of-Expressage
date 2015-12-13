package nju.edu.dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.PayorderPO;

public interface PayorderDataService extends Remote {

	// �½����
	public void insert(PayorderPO po) throws RemoteException;

	// �鿴���ʱ�������и����Ϣ
	public ArrayList<PayorderPO> find() throws RemoteException;

	// ɾ����������
	public void delete(PayorderPO po) throws RemoteException;

}
