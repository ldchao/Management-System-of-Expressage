package Server.Date_Stub.listinDateservice_Stub;

import Client.PO.OrderPO;
import Client.PO.ReceiverPO;
import Server.dataservice.listindataservice.ListinDataService;

public class ListinDataService_Stub implements ListinDataService{

	public void insert(OrderPO po) {
		// TODO Auto-generated method stub
		System.out.println("insert succeed");
	}

	public void insertReceiver(ReceiverPO po) {
		// TODO Auto-generated method stub
		System.out.println("insert succeed");
	}

	public double getPrice(String address1, String address2) {
		// TODO Auto-generated method stub
		if(address1.equals("�Ͼ�")&&address2.equals("����")){
			return 100;
		}else{
			return 0;
		}
	}
	
}
