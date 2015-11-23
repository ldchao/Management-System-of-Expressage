package Server.Date_Stub.storeDateservice_Stub;

import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.OrderPO;
import PO.StorePO;
import Server.dataservice.storedataservice.Inventory_managementDataService;

public class Inventory_managementDataService_Stub implements Inventory_managementDataService{

	// 查看指定仓库所有位置库存状态
	@Override
	public StorePO check(int store_number) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("新建成功");
		int[][][][] store=new int[4][5][20][20];
		StorePO po=new StorePO(0,0,store);
		return po;
	}

	// 更新指定仓库所有位置库存状态
	@Override
	public void updata(StorePO sp, int store_number) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("更新库存成功");
		
	}

	// 查看指定仓库指定时间段内出入库数量和金额
	@Override
	public String checknumber(int store_number, String startdata, String overdata)
			throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("查询出入库数量和金额");
		String number=new String();
		return number;
	}

	// 在文件中插入指定天的出入库数量和金额
	@Override
	public void addnumber(int store_number, String date, int storein_number,
			int storeout_number, int storein_money, int storeout_money)
			throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("新建成功");
		
	}

	// 查看指定仓库指定区域在指定时间段内所有订单信息
	@Override
	public ArrayList<String> checkorder(int store_number, int store_qu, String startdata,
			String overdata) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("查询订单信息");
		ArrayList<String> orderlist=new ArrayList<String>();
		return orderlist;
	}

	// 在文件中插入一行快递信息及入库信息
	@Override
	public void addorder(int store_number, OrderPO op) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("新建成功");
		
	}

	
}
