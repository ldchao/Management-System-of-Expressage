package Client.dataservice.loaddataservice;


import Client.PO.LoadorderPO;

public interface LoadDataService {

	//�½�װ����
	public void insert(LoadorderPO PO);
	
	//������Ϣ(������˾��������״̬)
	public void update(String key);
	
}
