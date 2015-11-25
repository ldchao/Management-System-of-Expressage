package nju.edu.dataservice.transferdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.SendorderPO;

public interface SendFormDataService extends Remote{

	//新建派件单
	public void insert(SendorderPO PO) throws RemoteException;
	
	//更新信息（订单状态）
	public void update(String key) throws RemoteException;
	
}
