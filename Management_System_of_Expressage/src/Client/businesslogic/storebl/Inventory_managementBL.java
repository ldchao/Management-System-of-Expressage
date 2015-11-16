package Client.businesslogic.storebl;

import java.util.ArrayList;

import Client.VO.OrderInStoreVO;
import Client.businesslogicservice.storeblservice.Inventory_managementBLService;

public class Inventory_managementBL implements Inventory_managementBLService{

	int store_num;
	
	
	//查看指定库区的库存量
	@Override
	public ArrayList<String> checkInventory(int store_qu) {
		// TODO Auto-generated method stub
		ArrayList<String> inventory=new ArrayList<String>();
		return inventory;
	}

	//查看指定仓库在指定时间段内的出入库数量和金额
	@Override
	public ArrayList<String> checkInventory(String startdata, String overdata) {
		// TODO Auto-generated method stub
		ArrayList<String> inventory_num=new ArrayList<String>();
		return inventory_num;
	}

	//查看指定仓库的指定区域在指定世间段内所有入库商品的订单信息
	@Override
	public ArrayList<OrderInStoreVO> checkInventoryOrder(int store_number, int store_qu,
			String startdata, String overdata, String way) {
		// TODO Auto-generated method stub
		ArrayList<OrderInStoreVO> inventory_order=new ArrayList<OrderInStoreVO>();
		return inventory_order;
	}

	//设置警戒值
	@Override
	public void setWarnData(int store_number, int warn_value) {
		// TODO Auto-generated method stub
		System.out.println("设置警戒值");
	}

	//设置提醒值
	@Override
	public void setRemindData(int store_number, int remind_value) {
		// TODO Auto-generated method stub
		System.out.println("设置提醒值");
	}

}
