package Server.dataservice.storedataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import Client.PO.OrderPO;
import Client.PO.StorePO;

public interface Inventory_managementDataService {

	// 查看指定仓库所有位置库存状态
	public StorePO check(int store_number) throws RemoteException;

	// 更新指定仓库所有位置库存状态
	public void updata(StorePO sp, int store_number) throws RemoteException;

	// 查看指定仓库指定时间段内出入库数量和金额
	public String checknumber(int store_number, String startdata, String overdata)
			throws RemoteException;

	// 在文件中插入指定天的出入库数量和金额
	public void addnumber(int store_number, String date, int storein_number,
			int storeout_number, int storein_money, int storeout_money)
			throws RemoteException;

	// 查看指定仓库指定区域在指定时间段内所有订单信息
	public ArrayList<String> checkorder(int store_number, int store_qu, String startdata,
			String overdata) throws RemoteException;

	// 在文件中插入一行快递信息及入库信息

	public void addorder(int store_number, OrderPO op) throws RemoteException;
}
