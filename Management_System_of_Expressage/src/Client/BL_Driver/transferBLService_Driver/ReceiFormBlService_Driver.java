package Client.BL_Driver.transferBLService_Driver;

import Client.PO.PayeeorderPO;
import Client.businesslogicservice.financeblservice.ReceiFormBlService;

public class ReceiFormBlService_Driver {

	public void drive(ReceiFormBlService receiFormBlService){
	    PayeeorderPO po = new PayeeorderPO();
		receiFormBlService.exportPayeeorder(po);
		receiFormBlService.endReceiForm();
	}
}
