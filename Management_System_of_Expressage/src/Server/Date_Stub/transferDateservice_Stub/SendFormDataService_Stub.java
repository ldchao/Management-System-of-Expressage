package Server.Date_Stub.transferDateservice_Stub;

import Client.PO.SendorderPO;
import Client.dataservice.transferdataservice.SendFormDataService;
import Server.dataservice.transferdataservice.*;

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
