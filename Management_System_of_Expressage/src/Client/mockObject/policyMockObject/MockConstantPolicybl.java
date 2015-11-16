package Client.mockObject.policyMockObject;

import Client.VO.ConstantVO;
import Client.businesslogic.policybl.ConstantPolicybl;
import Client.businesslogicservice.policyblservice.ConstantInfo;
import Client.businesslogicservice.policyblservice.ConstantPolicyBLService;

public class MockConstantPolicybl extends ConstantPolicybl{

	@Override
	public ConstantVO checkConstant(String address1, String address2) {
		// TODO Auto-generated method stub
		ConstantVO constantVO=new ConstantVO("南京", "北京", 100, 0);
		return constantVO;
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
