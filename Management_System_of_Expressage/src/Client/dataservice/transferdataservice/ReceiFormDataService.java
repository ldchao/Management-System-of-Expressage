package Client.dataservice.transferdataservice;

import Client.PO.ReceiveorderPO;

public interface ReceiFormDataService {

	//�½����յ�
	public void insert(ReceiveorderPO PO);
	
	//������Ϣ��˾���������Ͷ���״̬��
	public void update(String key);
	
}
