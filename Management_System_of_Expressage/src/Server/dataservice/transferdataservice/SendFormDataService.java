package Server.dataservice.transferdataservice;

import Client.PO.SendorderPO;

public interface SendFormDataService {

	//�½��ɼ���
	public void insert(SendorderPO PO);
	
	//������Ϣ������״̬��
	public void update(String key);
	
}
