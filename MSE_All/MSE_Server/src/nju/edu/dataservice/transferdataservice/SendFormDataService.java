package nju.edu.dataservice.transferdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.SendorderPO;

public interface SendFormDataService extends Remote {

	// 新建派件单
	public void insert(SendorderPO PO) throws RemoteException;

	// 得到未审批的派件单
	public ArrayList<String> get() throws RemoteException;

}
