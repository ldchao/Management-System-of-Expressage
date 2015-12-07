package nju.edu.businesslogicservice.storeblservice;

import java.util.ArrayList;

import nju.edu.VO.StoreinVO;

public interface Inventory_managementBLService {

	// 查看指定仓库在指定时间段内的出入库数量和金额
	public String[][] checkInventory(String startdate, String overdate);

	// 查看指定仓库的指定区域当前所有库存的商品的订单信息
	public String[][] checkInventoryOrder(String qu);
	
	//将指定仓库的指定区域当前所有库存的商品的订单信息输出到excel表
	public void InventoryOrderToExcel(String qu);

	// 得到当前警戒值
	public String getWarnData();

	// 设置警戒值
	public void setWarnData(String warnData);

	// 得到指定区域的提醒值
	public String getRemindData(int area);

	// 设置指定区域的提醒值
	public void setRemindData(int area, String RemindData);

	// 根据区域得到所有订单号
	public ArrayList<String> getOrderList(String qu);
}
