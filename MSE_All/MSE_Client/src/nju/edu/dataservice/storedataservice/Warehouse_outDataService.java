package nju.edu.dataservice.storedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.StoreoutorderPO;

public interface Warehouse_outDataService extends Remote {

	// 在数据库中插入一条出库单PO
	public void insert(StoreoutorderPO sp) throws RemoteException;

	// 查看未办理出库的中转单
	public ArrayList<String> checkUnstoreoutChangeorder()
			throws RemoteException;

	// 删除已经办理出库的中转单
	public void deleteChangeorder(String numOfTransfer) throws RemoteException;
}
