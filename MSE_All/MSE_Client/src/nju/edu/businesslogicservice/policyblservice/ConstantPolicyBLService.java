package nju.edu.businesslogicservice.policyblservice;

import nju.edu.VO.ConstantVO;

public interface ConstantPolicyBLService {
	//������س�����Ϣ
	public ConstantVO checkConstant(String address1,String address2);
	
	//�޸�������Ϣ
	public void editConstant(ConstantVO vo);

}
