package Server.Date_Stub.transferDateservice_Stub;

import Client.PO.ReceiveorderPO;
import Server.dataservice.transferdataservice.*;

public class ReceiFormDataService_Stub implements ReceiFormDataService{

	@Override
	public void insert(ReceiveorderPO PO) {
		System.out.println("�½����յ��ɹ���");		
	}

	@Override
	public void update(String key) {
		System.out.println("���½��յ��ɹ���");		
		
	}

}
