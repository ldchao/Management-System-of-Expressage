package Server.Date_Stub.policyDateservice_Stub;

import Client.PO.ConstantPO;
import Client.PO.SalaryPO;
import Server.dataservice.policydataservice.PolicyDataService;

public class PolicyDataService_Stub implements PolicyDataService{
	//нˮ��Ϣ
	String typeOfStaff;
	double salary;
	int typeOfStrategy;
	
	//������Ϣ
	String address1;
	String address2;
	double distance;
	double price;
	
	
	
	public PolicyDataService_Stub(String typeOfStaff, double salary,
			int typeOfStrategy, String address1, String address2,
			double distance, double price) {
		super();
		this.typeOfStaff = typeOfStaff;
		this.salary = salary;
		this.typeOfStrategy = typeOfStrategy;
		this.address1 = address1;
		this.address2 = address2;
		this.distance = distance;
		this.price = price;
	}

	public SalaryPO get(String typeOfStaff) {
		// TODO Auto-generated method stub
		if(typeOfStaff.equals("С��")){
			return new SalaryPO(typeOfStaff,salary,typeOfStrategy);
		}else{
			return null;
		}
	}

	public void updateSalary(SalaryPO po) {
		// TODO Auto-generated method stub
		System.out.println("update succeed");
	}

	public ConstantPO find(String address1, String address2) {
		// TODO Auto-generated method stub
		if(address1.equals("�Ͼ�")&&address2.equals("����")){
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
