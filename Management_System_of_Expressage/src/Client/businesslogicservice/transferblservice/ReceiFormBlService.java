package Client.businesslogicservice.transferblservice;

import Client.PO.ReceiveorderPO;

import java.util.ArrayList;

public interface ReceiFormBlService {
    //�½����յ�
	public void addReceiveOrder(String data, String changeOrderNum, String departPlace,
			String arriveState, ArrayList<String> orderNum, String name);
	
	//������յ�
	public void endRecei();
	
	//����
	public void exportReceiOrder(ReceiveorderPO po);
}
