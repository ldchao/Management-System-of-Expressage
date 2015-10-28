package Client.BL_Stub.transferBLService_Stub;

import java.util.ArrayList;

import Client.PO.SendorderPO;
import Client.businesslogicservice.transferblservice.*;

public class SendFormBlService_Stub implements SendFormBlService {

	@Override
	public void addReceiveOrder(String data, ArrayList<String> orderNum, String sender) {
		System.out.println("新建一个派送单！");
		
	}

	@Override
	public void endSend() {
		System.out.println("结束新建接收单！");
		
	}

	@Override
	public void exportSendOrder(SendorderPO po) {
		System.out.println("导出一个接收单！");
		
	}

}
