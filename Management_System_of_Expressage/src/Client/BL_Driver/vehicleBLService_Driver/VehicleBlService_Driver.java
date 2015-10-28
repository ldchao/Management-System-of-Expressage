package Client.BL_Driver.vehicleBLService_Driver;

import Client.businesslogicservice.vehicleblservice.VehicleBlService;

public class VehicleBlService_Driver {

	public void drive(VehicleBlService vehicleBlService){
		vehicleBlService.deleteVehicle("000");
		vehicleBlService.find("000");
		vehicleBlService.saveVehicle();
	}
}
