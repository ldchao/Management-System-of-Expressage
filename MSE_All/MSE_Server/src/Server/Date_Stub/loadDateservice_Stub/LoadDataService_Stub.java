package Server.Date_Stub.loadDateservice_Stub;

import PO.LoadorderPO;
import Server.dataservice.loaddataservice.LoadDataService;

public class LoadDataService_Stub implements LoadDataService {

	@Override
	public void insert(LoadorderPO PO) {
		System.out.println("�½�װ�����ɹ���");		
	}

	@Override
	public void update(String key) {
		System.out.println("����װ�����ɹ���");		
	}

}
