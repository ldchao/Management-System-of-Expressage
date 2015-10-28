package Client.BL_Driver.loadBLService_Driver;

import Client.businesslogicservice.loadblservice.ShippingBLService;

public class ShippingBLService_Driver {

	public void drive(ShippingBLService shippingBLService){
		shippingBLService.checkRemind();
		shippingBLService.build(null, "000", null, null);
	}
}
