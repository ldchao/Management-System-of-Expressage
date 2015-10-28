package Client.BL_Driver.transferBLService_Driver;

import Client.PO.ChangeorderPO;
import Client.businesslogicservice.transferblservice.TransferBLService;

public class TransferBLService_Driver {

	public void drive(TransferBLService transferBLService){
		transferBLService.checkRemind();
		ChangeorderPO cp = new ChangeorderPO(0, null, null, null, null, null, null, null, 0);
		transferBLService.save(cp);
	}
}
