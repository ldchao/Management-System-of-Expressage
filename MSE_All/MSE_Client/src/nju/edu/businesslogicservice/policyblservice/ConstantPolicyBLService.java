package nju.edu.businesslogicservice.policyblservice;

import nju.edu.VO.ConstantVO;

public interface ConstantPolicyBLService {
	public ConstantVO checkConstant(String address1,String address2);
	
	public void editConstant(ConstantVO vo);

}
