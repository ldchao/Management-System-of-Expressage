package Client.dataservice.listindataservice;

import PO.OrderPO;
import State.ResultMessage;

public interface ListinDataService {
	public void insert(OrderPO po);
	
	public void getPrice(String address1,String address2);
	
	public ResultMessage find(String number);
}
