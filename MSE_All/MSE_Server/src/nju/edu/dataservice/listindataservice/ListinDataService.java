package nju.edu.dataservice.listindataservice;

import PO.OrderPO;
import State.ResultMessage;

public interface ListinDataService {
	public void insert(OrderPO po);
	
	public double getPrice(String address1,String address2);
	
	public ResultMessage find(String number);
}
