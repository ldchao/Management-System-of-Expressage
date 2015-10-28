package Client.BL_Driver.transferBLService_Driver;

import Client.businesslogicservice.financeblservice.ReceiFormBlService;

public class ReceiveBLService_Driver {

	public void drive(ReceiFormBlService receiFormBlService){
		receiFormBlService.addReceiForm(null, null, null, null, null);
		receiFormBlService.endReceiForm();
	}
}
