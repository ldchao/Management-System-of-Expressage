package Client.businesslogicservice.storeblservice;

import java.util.ArrayList;

import Client.VO.OrderInStoreVO;

public interface Inventory_managementBLService {


	//查看指定库区的库存量
	public ArrayList<String> checkInventory(int store_qu);
	
	//查看指定仓库在指定时间段内的出入库数量和金额
	public ArrayList<String> checkInventory(String startdata,String overdata);
	
	//查看指定仓库的指定区域在指定世间段内所有入库商品的订单信息
	public ArrayList<OrderInStoreVO> checkInventoryOrder(int store_number,int store_qu, String startdata,String overdata,String way);
	
	//设置警戒值
	public void setWarnData (int store_number, int warn_value);
	
	//设置提醒值
	public void setRemindData (int store_number, int remind_value);
}
