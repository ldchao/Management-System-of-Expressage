package Server.Date_Stub.transferDateservice_Stub;

import PO.PayeeorderPO;
import PO.ReceiveorderPO;
import Server.dataservice.financedataservice.ReceiFormDataService;

public class ReceiFormDataService_Stub implements ReceiFormDataService{

	public void insert(ReceiveorderPO PO) {
		System.out.println("�½����յ��ɹ���");		
	}

	public void update(String key) {
		System.out.println("���½��յ��ɹ���");		
		
	}

	@Override
	public void insert(PayeeorderPO po) {
		// TODO Auto-generated method stub
		
	}

}
