package Client.BL_Driver.storeBLService_Driver;

import Client.businesslogicservice.storeblservice.Inventory_managementBLService;

public class Inventory_managementBLService_Driver {

	public void drive(Inventory_managementBLService inventory_managementBLService){
		inventory_managementBLService.setRemindData(0, 10);
		inventory_managementBLService.setWarnData(0, 02);
	}
}
