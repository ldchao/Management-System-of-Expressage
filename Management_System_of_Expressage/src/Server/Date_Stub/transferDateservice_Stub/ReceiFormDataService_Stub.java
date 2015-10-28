package Server.Date_Stub.transferDateservice_Stub;

import Client.PO.PayeeorderPO;
import Client.PO.ReceiveorderPO;
import Client.dataservice.financedataservice.ReceiFormDataService;

public class ReceiFormDataService_Stub implements ReceiFormDataService{

	public void insert(ReceiveorderPO PO) {
		System.out.println("新建接收单成功！");		
	}

	public void update(String key) {
		System.out.println("更新接收单成功！");		
		
	}

	@Override
	public void insert(PayeeorderPO po) {
		// TODO Auto-generated method stub
		
	}

}
