package nju.edu.businesslogicservice.policyblservice;

import nju.edu.VO.ConstantVO;

public interface ConstantPolicyBLService {
	public ConstantVO checkConstant(String address1,String address2);
	
	public void editConstant(String address1, String address2, double distance, double price);
	
	public void endConstant();
}
