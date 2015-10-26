package Server.dataservice.transferdataservice;

import Client.PO.SendorderPO;

public interface SendFormDataService {

	//新建派件单
	public void insert(SendorderPO PO);
	
	//更新信息（订单状态）
	public void update(String key);
	
}
