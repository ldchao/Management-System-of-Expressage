package Server.Date_Stub.listinDateservice_Stub;

import PO.OrderPO;
import Server.dataservice.listindataservice.ListinDataService;
import State.ResultMessage;

public class ListinDataService_Stub implements ListinDataService{

	public void insert(OrderPO po) {
		// TODO Auto-generated method stub
		System.out.println("insert succeed");
	}

	public double getPrice(String address1, String address2) {
		// TODO Auto-generated method stub
		if(address1.equals("南京")&&address2.equals("北京")){
			return 100;
		}else{
			return 0;
		}
	}

	@Override
	public ResultMessage find(String number) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
