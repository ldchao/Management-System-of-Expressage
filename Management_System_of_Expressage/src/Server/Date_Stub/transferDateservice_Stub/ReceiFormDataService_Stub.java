package Server.Date_Stub.transferDateservice_Stub;

import Client.PO.ReceiveorderPO;
import Server.dataservice.transferdataservice.*;

public class ReceiFormDataService_Stub implements ReceiFormDataService{

	@Override
	public void insert(ReceiveorderPO PO) {
		System.out.println("新建接收单成功！");		
	}

	@Override
	public void update(String key) {
		System.out.println("更新接收单成功！");		
		
	}

}
