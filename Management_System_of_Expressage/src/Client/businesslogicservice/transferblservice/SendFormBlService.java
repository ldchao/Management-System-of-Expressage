package Client.businesslogicservice.transferblservice;

import Client.PO.SendorderPO;

import java.util.ArrayList;

public interface SendFormBlService {
    //�½��ɼ���
	public void addReceiveOrder(String data, ArrayList<String> orderNum, String sender);
	
	//�����ɼ���
	public void endSend();
	
	//����
	public void exportSendOrder(SendorderPO po);
}
