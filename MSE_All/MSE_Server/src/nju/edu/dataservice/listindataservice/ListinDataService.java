package nju.edu.dataservice.listindataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.OrderPO;
import State.ResultMessage;

public interface ListinDataService extends Remote{
	//插入一个订单
	public void insert(OrderPO po) throws RemoteException;
	
	//获取两地价格常量
	public double getPrice(String address1,String address2)throws RemoteException;
	
	//根据id获得订单po
	public OrderPO getOrder(String id)throws RemoteException;
	//输入id更改物流信息
	public void update(String id,String message)throws RemoteException;
	//获得订单中货物的重量
	public double getWeigtht(String id)throws RemoteException;
	//获得所有订单的po
	public ArrayList<OrderPO> getAllOrders() throws RemoteException;
	//更新po审批状态
	public void changestate(OrderPO po)throws RemoteException;
	
	//查询未审批的订单，用于查重
	public boolean checkOrder(String id)throws RemoteException;
}
