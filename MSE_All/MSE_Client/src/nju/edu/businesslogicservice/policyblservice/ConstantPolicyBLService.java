package nju.edu.businesslogicservice.policyblservice;

import nju.edu.VO.ConstantVO;

public interface ConstantPolicyBLService {
	//获得两地常量信息
	public ConstantVO checkConstant(String address1,String address2);
	
	//修改两地信息
	public void editConstant(ConstantVO vo);

}
