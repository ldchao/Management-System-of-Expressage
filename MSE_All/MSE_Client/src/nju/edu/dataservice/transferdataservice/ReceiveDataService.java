package nju.edu.dataservice.transferdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.ArriverorderPO;
import PO.LoadorderPO;

public interface ReceiveDataService extends Remote{
	
	//在数据库中插入一个中转中心到达单的PO
	public void insert(ArriverorderPO ap)throws RemoteException;
	
	//查看未审批的接收单
	public ArrayList<String> get() throws RemoteException;
	
	//在数据中查找对应的未接收的装运单
	public LoadorderPO checkUnreceive_loadorderPO(String s)throws RemoteException;
}
