package Client.businesslogicservice.transferblservice;

import java.util.ArrayList;

import PO.SendorderPO;

public interface SendFormBlService {
    //�½��ɼ���
	public void addReceiveOrder(String data, ArrayList<String> orderNum, String sender);
	
	//�����ɼ���
	public void endSend();
	
	//����
	public void exportSendOrder(SendorderPO po);
}
