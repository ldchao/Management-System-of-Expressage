package Client.BL_Driver.billBLService_Driver;

import Client.businesslogicservice.billblservice.BillBLService;

public class BillBLService_Driver {
	public void drive(BillBLService billBLService) {
		String institution = "NJU", staff = "Everyone", vehicle = "Benz", store = "whitehouse", date = "2015-10-26", creator = "SURE", account = "SURE";
		billBLService.addBill(institution, staff, vehicle, store, account,
				date, creator);
		/*
		 * 判断账是否存在 待完成
		 */
		billBLService.checkBill();
	}
}
