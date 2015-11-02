package Client.businesslogicservice.policyblservice;

import Client.VO.SalaryVO;

public interface SalaryPolicyBLSerivce {
	public SalaryVO checkSalary(String typeOfStaff);
	
	public void editSalary(String typeOfStaff,String salary,int typeOfSalary);
	
	public void endSalary();
	
}
