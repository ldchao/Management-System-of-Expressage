package Server.Date_Stub.transferDateservice_Stub;

import PO.SendorderPO;
import Server.dataservice.transferdataservice.SendFormDataService;

public class SendFormDataService_Stub implements SendFormDataService {

	@Override
	public void insert(SendorderPO PO) {
		System.out.println("新建派送单成功！");		
		
	}

	@Override
	public void update(String key) {
		System.out.println("新建派送单成功！");		
		
	}

}
