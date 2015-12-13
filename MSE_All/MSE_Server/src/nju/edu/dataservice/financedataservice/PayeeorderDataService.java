package nju.edu.dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.PayeeorderPO;
import PO.PayorderPO;

public interface PayeeorderDataService extends Remote {

	// 新建收款单
	public void insert(PayeeorderPO po) throws RemoteException;

	// 查看收款单
	public ArrayList<PayeeorderPO> checkPayeeorder(String name, String shop)throws RemoteException;
	
	public ArrayList<PayeeorderPO> checkPayeeorders()throws RemoteException;
	
	public void delete(PayeeorderPO po) throws RemoteException;
}
