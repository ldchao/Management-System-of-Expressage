package nju.edu.data.storedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.dataservice.storedataservice.Inventory_managementDataService;
import PO.OrderPO;
import PO.StorePO;

public class Inventory_managementData extends UnicastRemoteObject implements Inventory_managementDataService{

	public Inventory_managementData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	// 查看指定仓库所有位置库存状态
	@Override
	public StorePO check(int store_number) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	// 更新指定仓库所有位置库存状态
	@Override
	public void updata(StorePO sp, int store_number) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	// 查看指定仓库指定时间段内出入库数量和金额
	@Override
	public String checknumber(int store_number, String startdata,
			String overdata) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	// 在文件中插入指定天的出入库数量和金额
	@Override
	public void addnumber(int store_number, String date, int storein_number,
			int storeout_number, int storein_money, int storeout_money)
			throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	// 查看指定仓库指定区域在指定时间段内所有订单信息
	@Override
	public ArrayList<String> checkorder(int store_number, int store_qu,
			String startdata, String overdata) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	// 在文件中插入一行快递信息及入库信息
	@Override
	public void addorder(int store_number, OrderPO op) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
