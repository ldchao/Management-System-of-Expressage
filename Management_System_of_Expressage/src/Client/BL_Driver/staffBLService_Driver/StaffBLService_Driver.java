package Client.BL_Driver.staffBLService_Driver;

import Client.businesslogicservice.staffblservice.StaffBLService;

public class StaffBLService_Driver {

	public void drive(StaffBLService staffBLService){
		staffBLService.addStaff("ldc", "仙林大道", "快递员", "81617674", "15250928034");
		staffBLService.checkStaff("ldc");
		staffBLService.deleteStaff("qjj");
		staffBLService.endStaff();
	}
}
