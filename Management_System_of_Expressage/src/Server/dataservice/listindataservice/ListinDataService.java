package Server.dataservice.listindataservice;

import Client.PO.OrderPO;
import Client.PO.ReceiverPO;

public interface ListinDataService {
	public void insert(OrderPO po);
	
	public double getPrice(String address1,String address2);
	
}
