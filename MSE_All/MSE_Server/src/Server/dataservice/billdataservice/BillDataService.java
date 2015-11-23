package Server.dataservice.billdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.StartinfoPO;

public interface BillDataService extends Remote{

	// 新建账
	public void insert(StartinfoPO po)throws RemoteException;

	// 查找所有帐
	public ArrayList<StartinfoPO> find()throws RemoteException;
}
