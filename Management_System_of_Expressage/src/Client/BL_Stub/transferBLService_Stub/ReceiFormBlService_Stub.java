package Client.BL_Stub.transferBLService_Stub;

import java.util.ArrayList;

import Client.PO.ReceiveorderPO;
import Client.businesslogicservice.transferblservice.*;

public class ReceiFormBlService_Stub implements ReceiFormBlService{

	@Override
	public void addReceiveOrder(String data, String changeOrderNum, String departPlace, String arriveState,
			ArrayList<String> orderNum, String name) {
		System.out.println("新建一个接收单！");
		
	}

	@Override
	public void endRecei() {
		System.out.println("接收新建接收单！");
		
	}

	@Override
	public void exportReceiOrder(ReceiveorderPO po) {
		System.out.println("导出一个接收单！");
		
	}

}
