package Client.BL_Driver.policyBLService_Driver;

import Client.businesslogicservice.policyblservice.ConstantPolicyBLService;
import Client.businesslogicservice.policyblservice.SalaryPolicyBLSerivce;

public class PolicyBLService_Driver {

	public void drive(SalaryPolicyBLSerivce SalarypolicyBLSerivce,
			ConstantPolicyBLService ConstantpolicyBLService){
		SalarypolicyBLSerivce.checkSalary("driver");
		ConstantpolicyBLService.editConstant("北京", "南京", 400, 20);
		ConstantpolicyBLService.endConstant();
		SalarypolicyBLSerivce.endSalary();
	}
}
