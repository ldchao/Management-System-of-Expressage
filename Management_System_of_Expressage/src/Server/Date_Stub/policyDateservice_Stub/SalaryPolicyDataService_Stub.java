package Server.Date_Stub.policyDateservice_Stub;

import Client.PO.ConstantPO;
import Client.PO.SalaryPO;
import Client.dataservice.policydataservice.SalaryPolicyDataService;

public class SalaryPolicyDataService_Stub implements SalaryPolicyDataService{
	//薪水信息
	String typeOfStaff;
	double salary;
	int typeOfStrategy;
	
	//常量信息
	String address1;
	String address2;
	double distance;
	double price;
	
	
	
	public SalaryPolicyDataService_Stub(String typeOfStaff, double salary,
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
		if(typeOfStaff.equals("小米")){
			return new SalaryPO(typeOfStaff,salary,typeOfStrategy);
		}else{
			return null;
		}
	}

	public void updateSalary(SalaryPO po) {
		// TODO Auto-generated method stub
		System.out.println("update succeed");
	}

}
