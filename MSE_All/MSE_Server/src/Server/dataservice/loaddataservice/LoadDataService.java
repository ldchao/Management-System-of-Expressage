package Server.dataservice.loaddataservice;


import PO.LoadorderPO;

public interface LoadDataService {

	//�½�װ����
	public void insert(LoadorderPO PO);
	
	//������Ϣ(������˾��������״̬)
	public void update(String key);
	
}
