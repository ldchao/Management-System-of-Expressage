package Client.mockObject.policyMockObject;

import Client.VO.SalaryVO;
import Client.businesslogic.policybl.SalaryPolicybl;

public class MockSalaryPolicybl extends SalaryPolicybl{
	public SalaryVO checkSalary(String typeOfStaff) {
		// TODO Auto-generated method stub
		SalaryVO salaryVO=new SalaryVO("¿ìµÝÔ±", 0, 0);
		return salaryVO;
	}
}
