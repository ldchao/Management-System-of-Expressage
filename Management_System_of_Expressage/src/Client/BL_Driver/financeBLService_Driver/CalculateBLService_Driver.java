package Client.BL_Driver.financeBLService_Driver;

import Client.businesslogicservice.financeblservice.CalculateBLService;

public class CalculateBLService_Driver {
	public void drive(CalculateBLService calculateBLService){
		calculateBLService.check("2015-10-26", "000");
		double[] pay = {1.5,4.5,10.5};
		double total = calculateBLService.total(pay);
		System.out.println(total);
	}
}
