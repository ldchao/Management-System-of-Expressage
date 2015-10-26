package Server.dataservice.financedataservice;

import Client.PO.PayeeorderPO;

public interface ReceiFormDataService {
	
	//新建收款单
	public void insert(PayeeorderPO po);

}
