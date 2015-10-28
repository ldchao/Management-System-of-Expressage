package Client.BL_Driver.policyBLService_Driver;

import Client.businesslogicservice.policyblservice.PolicyBLSerivce;

public class PolicyBLService_Driver {

	public void drive(PolicyBLSerivce policyBLSerivce){
		policyBLSerivce.checkSalary("driver");
		policyBLSerivce.editConstant("北京", "南京", 400, 20);
		policyBLSerivce.endConstant();
		policyBLSerivce.endSalary();
	}
}
