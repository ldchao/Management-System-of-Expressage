package nju.edu.businesslogicservice.listinblservice;

import java.util.ArrayList;

import PO.OrderPO;

public interface ListApprove {
	//������ж���
	public ArrayList<OrderPO> getAllOrders();
	
	//�ı��������ݵ�״̬
	public void changestate(OrderPO po);
}
