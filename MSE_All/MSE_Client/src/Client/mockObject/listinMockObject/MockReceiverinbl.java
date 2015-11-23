package Client.mockObject.listinMockObject;

import Client.businesslogic.transferbl.ReceiveBL;
import PO.ReceiverPO;

public class MockReceiverinbl extends ReceiveBL{
	public void addReceiver(String courier, String phoneOfcourier, String id, String receiver, String address,
			String time, String cellphone) {
		// TODO Auto-generated method stub
		ReceiverPO newreceiver=new ReceiverPO(courier, phoneOfcourier, id, receiver, address, time, cellphone);
		System.out.println("succeed");
	}
}
