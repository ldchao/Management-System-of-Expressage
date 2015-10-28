package Client.BL_Driver.loadBLService_Driver;

import Client.PO.LoadorderPO;
import Client.businesslogicservice.loadblservice.LoadBlService;

public class LoadBLService_Driver {

	public void drive(LoadBlService loadBlService){
		loadBlService.getTotal("car");
		loadBlService.endLoad();
	}
}
