package nju.edu.businesslogicservice.transferblservice;

import java.util.ArrayList;

import PO.ReceiveorderPO;

public interface ReceiFormBlService {
    
	//�½����յ�
	public void addReceiveOrder(String data, String changeOrderNum, String departPlace,
			String arriveState, ArrayList<String> orderNum, String name);
	
	//������յ�
	public void endRecei();
	
	//����
	public void exportReceiOrder(ReceiveorderPO po);
}