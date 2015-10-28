package Client.BL_Driver.storeBLService_Driver;

import Client.PO.StoreoutorderPO;
import Client.businesslogicservice.storeblservice.Warehouse_outBLService;

public class Warehouse_outBLService_Driver {

	public void drive(Warehouse_outBLService warehouse_outBLService){
		warehouse_outBLService.checkRemind();
		StoreoutorderPO sp = new StoreoutorderPO(null, null, null, null, null, 0);
		warehouse_outBLService.save(sp);;
	}
}
