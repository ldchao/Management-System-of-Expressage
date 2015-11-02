package Client.BL_Stub.policyBLService_Stub;

import Client.VO.SalaryVO;
import Client.businesslogicservice.policyblservice.SalaryPolicyBLSerivce;

public class SalaryPolicyBLService_Stub implements SalaryPolicyBLSerivce{
	//薪水信息
	String typeOfStaff;
	double salary;
	int typeOfStrategy;
	
	public SalaryPolicyBLService_Stub(String typeOfStaff, double salary,
			int typeOfStrategy) {
		super();
		this.typeOfStaff = typeOfStaff;
		this.salary = salary;
		this.typeOfStrategy = typeOfStrategy;
	}

	public SalaryVO checkSalary(String typeOfStaff) {
		// TODO Auto-generated method stub
		if(typeOfStaff.equals("快递员")){
			return new SalaryVO(typeOfStaff,salary,typeOfStrategy);
		}else{
			return null;
		}
	}

	public void editSalary(String typeOfStaff, String salary, int typeOfSalary) {
		// TODO Auto-generated method stub
		System.out.println("edit succeed");
	}

	public void endSalary() {
		// TODO Auto-generated method stub
		System.out.println("end the salary");
	}

}
