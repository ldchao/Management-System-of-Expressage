package Client.BL_Stub.transferBLService_Stub;

import java.util.ArrayList;

import Client.PO.ReceiveorderPO;
import Client.businesslogicservice.transferblservice.*;

public class ReceiFormBlService_Stub implements ReceiFormBlService{

	@Override
	public void addReceiveOrder(String data, String changeOrderNum, String departPlace, String arriveState,
			ArrayList<String> orderNum, String name) {
		System.out.println("�½�һ�����յ���");
		
	}

	@Override
	public void endRecei() {
		System.out.println("�����½����յ���");
		
	}

	@Override
	public void exportReceiOrder(ReceiveorderPO po) {
		System.out.println("����һ�����յ���");
		
	}

}
