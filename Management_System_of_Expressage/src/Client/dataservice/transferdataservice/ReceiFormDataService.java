package Client.dataservice.transferdataservice;

import Client.PO.ReceiveorderPO;

public interface ReceiFormDataService {

	//新建接收单
	public void insert(ReceiveorderPO PO);
	
	//更新信息（司机、车辆和订单状态）
	public void update(String key);
	
}
