package Server.Date_Stub.financeDateservice_Stub;

import Client.PO.PayeeorderPO;
import Client.dataservice.financedataservice.ReceiFormDataService;
import Server.dataservice.financedataservice.*;

public class ReceiFormDataService_Stub implements ReceiFormDataService{

	@Override
	public void insert(PayeeorderPO po) {
		System.out.println("新建收款单完成！");
	}

}
