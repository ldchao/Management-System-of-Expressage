package Client.BL_Driver.billBLService_Driver;

import Client.businesslogicservice.billblservice.BillBLService;

public class BillBLService_Driver {
	public void drive(BillBLService billBLService) {
		String institution = "NJU", staff = "Everyone", vehicle = "Benz", store = "whitehouse", date = "2015-10-26", creator = "SURE", account = "SURE";
//		billBLService.addBill(String name, String account, String organization,
//				String staff, String vehicle, String store;
		/*
		 * �ж����Ƿ���� �����
		 */
		billBLService.checkBill();
	}
}
