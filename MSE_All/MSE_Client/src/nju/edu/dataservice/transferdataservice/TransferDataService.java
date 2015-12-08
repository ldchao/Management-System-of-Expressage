package nju.edu.dataservice.transferdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.ChangeorderPO;

public interface TransferDataService extends Remote{
	
	//在数据库中插入一个中转单PO
	public void insert(ChangeorderPO cp)throws RemoteException;
	
	//得到未审批的中转单
	public ArrayList<String> get() throws RemoteException;
}
