package nju.edu.businesslogicservice.listinblservice;

import java.util.ArrayList;

import PO.OrderPO;

public interface ListApprove {
	//������ж���
	public ArrayList<OrderPO> getAllOrders();
	
	public void changestate(OrderPO po);
}
