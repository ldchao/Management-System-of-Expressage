package nju.edu.businesslogicservice.policyblservice;

import nju.edu.VO.SalaryVO;

public interface SalaryPolicyBLSerivce {
	//���нˮ��Ϣ
	public SalaryVO checkSalary(String typeOfStaff);
	
	//�޸�нˮ
	public void editSalary(SalaryVO vo);

}
