package Client.dataservice.listindataservice;

import Client.PO.OrderPO;
import Client.PO.ReceiverPO;

public interface ListinDataService {
	public void insert(OrderPO po);
	
	public void insertReceiver(ReceiverPO po);
	
	public void getPrice(String address1,String address2);
	
}
