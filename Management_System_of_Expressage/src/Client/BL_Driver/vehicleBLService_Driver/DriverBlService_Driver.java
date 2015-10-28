package Client.BL_Driver.vehicleBLService_Driver;

import Client.businesslogicservice.vehicleblservice.DriverBlService;

public class DriverBlService_Driver {

	public void drive(DriverBlService driverBlService) {
		driverBlService.deleteDriver("Driver1");
		driverBlService.find("ldc");
		driverBlService.saveDriver();
		driverBlService.addDriver("000", "ldc", "000", "1996-8-21", "000",
				"15250987653", "ÄÐ", "2025-10-01", "¿ÕÏÐ");
	}
}
