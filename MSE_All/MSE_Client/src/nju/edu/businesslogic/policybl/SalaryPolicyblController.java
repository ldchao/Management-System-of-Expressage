package nju.edu.businesslogic.policybl;

import nju.edu.VO.SalaryVO;
import nju.edu.businesslogicservice.policyblservice.SalaryPolicyBLSerivce;

public class SalaryPolicyblController implements SalaryPolicyBLSerivce{
	SalaryPolicybl SalaryPolicybl=new SalaryPolicybl();
	@Override
	public SalaryVO checkSalary(String typeOfStaff) {
		// TODO Auto-generated method stub
		SalaryPolicybl.checkSalary(typeOfStaff);
		return null;
	}

	@Override
	public void editSalary(String typeOfStaff, String salary, int typeOfSalary) {
		// TODO Auto-generated method stub
		
	}

}
