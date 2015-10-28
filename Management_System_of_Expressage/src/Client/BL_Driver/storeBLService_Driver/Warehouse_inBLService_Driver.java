package Client.BL_Driver.storeBLService_Driver;

import Client.businesslogicservice.storeblservice.Warehouse_inBLService;

public class Warehouse_inBLService_Driver {
	public void drive(Warehouse_inBLService warehouse_inBLService){
		warehouse_inBLService.checkRemind();
		warehouse_inBLService.build(null, 0, 0);
		warehouse_inBLService.save(null);
	}
}
