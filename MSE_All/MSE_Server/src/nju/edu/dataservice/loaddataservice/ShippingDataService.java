package nju.edu.dataservice.loaddataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.ChangeorderPO;
import PO.LoadorderPO;

public interface ShippingDataService extends Remote {
	// 在数据库中插入一个装运单PO
	public void insert(LoadorderPO lp) throws RemoteException;
	
	//查看未审批的装运单
	public ArrayList<LoadorderPO> get() throws RemoteException;

	// 产看需要装运的中转单
	public ArrayList<String> checkUnshippingChangeorder() throws RemoteException;
	
	//删除已经进行装运管理的中转单
	public void deleteChangeorder(String numOfTransfer) throws RemoteException;
}
