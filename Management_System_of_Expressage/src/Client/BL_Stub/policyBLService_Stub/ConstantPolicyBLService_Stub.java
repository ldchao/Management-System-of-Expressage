package Client.BL_Stub.policyBLService_Stub;

import Client.VO.ConstantVO;
import Client.businesslogicservice.policyblservice.ConstantPolicyBLService;

public class ConstantPolicyBLService_Stub implements ConstantPolicyBLService{
	//������Ϣ
	String address1;
	String address2;
	double distance;
	double price;	
	
	public ConstantPolicyBLService_Stub(String address1, String address2,
			double distance, double price) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.distance = distance;
		this.price = price;
	}
	
	public ConstantVO searchConstant(String address1, String address2) {
		// TODO Auto-generated method stub
		if(address1.equals("�Ͼ�")&&address2.equals("����")){
			return new ConstantVO(address1,address2,
					distance,price);
		}else{
			return null;
		}
		
	}

	public void editConstant(String address1, String address2, double distance,
			double price) {
		// TODO Auto-generated method stub
		System.out.println("edit succeed");
	}

	public void endConstant() {
		// TODO Auto-generated method stub
		System.out.println("end the constant");
	}
}
