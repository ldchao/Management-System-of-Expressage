package nju.edu.dataservice.listindataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.ReceiverPO;
import State.ResultMessage;

public interface ReceiverinDataService extends Remote{
	//新建收件人信息单
	public void insertReceiver(ReceiverPO po) throws RemoteException;
	
	//查找是否存在输入的订单号
	public boolean find(String number)throws RemoteException;
}
