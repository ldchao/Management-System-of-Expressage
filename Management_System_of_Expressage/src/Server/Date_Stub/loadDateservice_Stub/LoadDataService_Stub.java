package Server.Date_Stub.loadDateservice_Stub;

import Client.PO.LoadorderPO;
import Server.dataservice.loaddataservice.*;

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
