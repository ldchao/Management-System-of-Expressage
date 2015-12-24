package nju.edu.dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.PayeeorderPO;

public interface PayeeorderDataService extends Remote{
	
	//�½��տ
	public void insert(PayeeorderPO po) throws RemoteException;
	
	// �鿴�տ
	public ArrayList<PayeeorderPO> checkPayeeorder(String date, String shop)throws RemoteException;

	public ArrayList<PayeeorderPO> checkPayeeorders()throws RemoteException;
	
	public ArrayList<PayeeorderPO> findUnchecked()throws RemoteException;

	public void delete(PayeeorderPO po) throws RemoteException;
}
