package nju.edu.dataservice.storedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.OrderPO;
import PO.StorePO;

public interface Inventory_managementDataService extends Remote{

	// 查看指定仓库指定时间段内入库量
	public ArrayList<String> checkStoreinNumber(String startdata, String overdata)
			throws RemoteException;

	// 查看指定仓库指定时间段内出库量
	public ArrayList<String> checkStoreoutNumber(String startdata, String overdata)
			throws RemoteException;
	
	// 根据订单号查找入库单
	public ArrayList<String> checkorder(ArrayList<String> orderNum) throws RemoteException;
}
