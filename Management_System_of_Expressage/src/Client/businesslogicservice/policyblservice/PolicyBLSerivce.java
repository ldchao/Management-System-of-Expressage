package Client.businesslogicservice.policyblservice;

import Client.VO.ConstantVO;
import Client.VO.SalaryVO;

public interface PolicyBLSerivce {
	public SalaryVO checkSalary(String typeOfStaff);
	
	public void editSalary(String typeOfStaff,String salary,int typeOfSalary);
	
	public void endSalary();
	
	public ConstantVO searchConstant(String address1,String address2);
	
	public void editConstant(String address1, String address2, double distance, double price);
	
	public void endConstant();
	
}
