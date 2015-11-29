package nju.edu.dataservice.listindataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.OrderPO;
import State.ResultMessage;
import nju.edu.VO.OrderVO;

public interface ListinDataService extends Remote{
	public void insert(OrderPO po) throws RemoteException;
	
	public void getPrice(String address1,String address2)throws RemoteException;
	
	public ResultMessage find(String number)throws RemoteException;

	public OrderPO getOrder(String id)throws RemoteException;
	
	public void update(String id,String message)throws RemoteException;
	
	public double getWeigtht(String id)throws RemoteException;
}
