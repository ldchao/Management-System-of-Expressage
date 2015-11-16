package Client.mockObject.policyMockObject;

import Client.VO.ConstantVO;
import Client.businesslogic.policybl.ConstantPolicybl;
import Client.businesslogicservice.policyblservice.ConstantInfo;
import Client.businesslogicservice.policyblservice.ConstantPolicyBLService;

public class MockConstantPolicybl extends ConstantPolicybl{

	@Override
	public ConstantVO searchConstant(String address1, String address2) {
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
		return 100;
	}

	@Override
	public double GetMoney(String address1, String address2) {
		// TODO Auto-generated method stub
		return 1;
	}

}
