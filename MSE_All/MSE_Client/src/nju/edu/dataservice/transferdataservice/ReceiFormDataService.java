package nju.edu.dataservice.transferdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.ReceiveorderPO;

public interface ReceiFormDataService extends Remote{

	//新建接收单
	public void insert(ReceiveorderPO PO) throws RemoteException; 
	
	//得到未审批的接收单
	public ArrayList<String> get() throws RemoteException;
	
}
