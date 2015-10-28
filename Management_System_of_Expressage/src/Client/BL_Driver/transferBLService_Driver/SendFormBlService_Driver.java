package Client.BL_Driver.transferBLService_Driver;

import Client.businesslogicservice.transferblservice.SendFormBlService;

public class SendFormBlService_Driver {

	public void driver(SendFormBlService sendFormBlService){
		sendFormBlService.addReceiveOrder(null, null, null);
		sendFormBlService.endSend();
	}
}
