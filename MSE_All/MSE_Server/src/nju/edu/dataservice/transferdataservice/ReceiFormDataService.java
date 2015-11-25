package nju.edu.dataservice.transferdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.ReceiveorderPO;

public interface ReceiFormDataService extends Remote{

	//新建接收单
	public void insert(ReceiveorderPO PO) throws RemoteException;
	
	//更新信息（司机、车辆和订单状态）
	public void update(String key) throws RemoteException;
	
}
