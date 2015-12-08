package nju.edu.dataservice.storedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.StoreinorderPO;

public interface Warehouse_inDataService extends Remote {

	// 在数据库中插入一条入库单PO
	public void insert(StoreinorderPO sp) throws RemoteException;
	
	//得到未审批的入库单
	public ArrayList<String> get() throws RemoteException;

	// 查看未入库的到达单
	public ArrayList<String> checkUnstoreinArriveorder() throws RemoteException;

	// 清空未入库到达单消息提醒
	public void deleteRemind() throws RemoteException;

	// 根据订单查看对应的库存位置
	public String[] getLocation(String id) throws RemoteException;
}
