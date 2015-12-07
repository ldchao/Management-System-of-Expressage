package nju.edu.businesslogicservice.storeblservice;

import java.util.ArrayList;

public interface Inventory_managementInfo {

	//得到当前警戒值
	public String getWarnData();
	
	//设置警戒值
	public void setWarnData(String warnData);
	
	//得到指定区域的提醒值
	public String getRemindData(int area);
	
	//设置指定区域的提醒值
	public void setRemindData(int area,String RemindData);
	
	//根据区域得到所有订单号
	public ArrayList<String> getOrderList(String qu);
}
