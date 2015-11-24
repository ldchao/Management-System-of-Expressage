package nju.edu.businesslogicservice.policyblservice;

import nju.edu.VO.SalaryVO;

public interface SalaryPolicyBLSerivce {
	public SalaryVO checkSalary(String typeOfStaff);
	
	public void editSalary(String typeOfStaff,String salary,int typeOfSalary);
	
	public void endSalary();
	
}
