package Client.dataservice.transferdataservice;

import PO.SendorderPO;

public interface SendFormDataService {

	//�½��ɼ���
	public void insert(SendorderPO PO);
	
	//������Ϣ������״̬��
	public void update(String key);
	
}
