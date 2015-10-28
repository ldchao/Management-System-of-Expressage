package Client.dataservice.loaddataservice;


import Client.PO.LoadorderPO;

public interface LoadDataService {

	//新建装车单
	public void insert(LoadorderPO PO);
	
	//更新信息(车辆、司机及订单状态)
	public void update(String key);
	
}
