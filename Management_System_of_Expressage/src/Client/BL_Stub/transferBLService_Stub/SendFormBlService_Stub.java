package Client.BL_Stub.transferBLService_Stub;

import java.util.ArrayList;

import Client.PO.SendorderPO;
import Client.businesslogicservice.transferblservice.*;

public class SendFormBlService_Stub implements SendFormBlService {

	@Override
	public void addReceiveOrder(String data, ArrayList<String> orderNum, String sender) {
		System.out.println("�½�һ�����͵���");
		
	}

	@Override
	public void endSend() {
		System.out.println("�����½����յ���");
		
	}

	@Override
	public void exportSendOrder(SendorderPO po) {
		System.out.println("����һ�����յ���");
		
	}

}
