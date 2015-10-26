package Server.Date_Stub.financeDateservice_Stub;

import Client.PO.PayeeorderPO;
import Server.dataservice.financedataservice.*;

public class ReceiFormDataService_Stub implements ReceiFormDataService{

	@Override
	public void insert(PayeeorderPO po) {
		System.out.println("新建收款单完成！");
	}

}
