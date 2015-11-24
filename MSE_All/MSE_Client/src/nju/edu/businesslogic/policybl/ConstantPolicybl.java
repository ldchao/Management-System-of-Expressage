package nju.edu.businesslogic.policybl;

import nju.edu.VO.ConstantVO;
import nju.edu.businesslogicservice.policyblservice.ConstantInfo;
import nju.edu.businesslogicservice.policyblservice.ConstantPolicyBLService;

public class ConstantPolicybl implements ConstantPolicyBLService,ConstantInfo{

	@Override
	public ConstantVO checkConstant(String address1, String address2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editConstant(String address1, String address2, double distance, double price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endConstant() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double GetDistance(String address1, String address2) {
		// TODO Auto-generated method stub
		
		return 0;
	}

	@Override
	public double GetMoney(String address1, String address2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
