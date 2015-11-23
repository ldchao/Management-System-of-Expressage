package Server.Date_Stub.financeDateservice_Stub;

import PO.PayeeorderPO;
import Server.dataservice.financedataservice.ReceiFormDataService;

public class ReceiFormDataService_Stub implements ReceiFormDataService{

	@Override
	public void insert(PayeeorderPO po) {
		System.out.println("新建收款单完成！");
	}

}
