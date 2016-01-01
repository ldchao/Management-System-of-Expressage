package nju.edu.businesslogicservice.policyblservice;

import nju.edu.VO.SalaryVO;

public interface SalaryPolicyBLSerivce {
	//获得薪水信息
	public SalaryVO checkSalary(String typeOfStaff);
	
	//修改薪水
	public void editSalary(SalaryVO vo);

}
