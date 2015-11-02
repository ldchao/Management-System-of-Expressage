package Server.Date_Stub.policyDateservice_Stub;

import Client.PO.ConstantPO;
import Server.dataservice.policydataservice.ConstantPolicyDataService;

public class ConstantPolicyDataService_Stub implements ConstantPolicyDataService{
	//常量信息
	String address1;
	String address2;
	double distance;
	double price;
	
	
	
	public ConstantPolicyDataService_Stub(String address1, String address2,
			double distance, double price) {
		super();

		this.address1 = address1;
		this.address2 = address2;
		this.distance = distance;
		this.price = price;
	}



	@Override
	public ConstantPO find(String address1, String address2) {
		// TODO Auto-generated method stub
		if(address1.equals("南京")&&address2.equals("北京")){
			return new ConstantPO(address1,address2,distance,price);
		}else{
			return null;
		}
	}

	public void updateConstant(ConstantPO po) {
		// TODO Auto-generated method stub
		System.out.println("update succeed");
	}
}
