package nju.edu.businesslogicservice.listinblservice;

import java.util.ArrayList;

import PO.OrderPO;

public interface ListApprove {
	//获得所有订单
	public ArrayList<OrderPO> getAllOrders();
	
	//改变审批单据的状态
	public void changestate(OrderPO po);
}
