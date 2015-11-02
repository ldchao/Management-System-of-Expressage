package Client.dataservice.listindataservice;

import Client.PO.OrderPO;

public interface ListinDataService {
	public void insert(OrderPO po);
	
	public void getPrice(String address1,String address2);
	
}
