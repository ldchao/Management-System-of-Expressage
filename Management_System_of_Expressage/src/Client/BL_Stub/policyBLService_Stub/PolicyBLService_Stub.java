package Client.BL_Stub.policyBLService_Stub;

import Client.VO.ConstantVO;
import Client.VO.SalaryVO;
import Client.businesslogicservice.policyblservice.PolicyBLSerivce;

public class PolicyBLService_Stub implements PolicyBLSerivce{
	//нˮ��Ϣ
	String typeOfStaff;
	double salary;
	int typeOfStrategy;
	
	//������Ϣ
	String address1;
	String address2;
	double distance;
	double price;	
	
	public PolicyBLService_Stub(String typeOfStaff, double salary,
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

	public SalaryVO checkSalary(String typeOfStaff) {
		// TODO Auto-generated method stub
		if(typeOfStaff.equals("���Ա")){
			return new SalaryVO(typeOfStaff,salary,typeOfStrategy);
		}else{
			return null;
		}
	}

	public void editSalary(String typeOfStaff, String salary, int typeOfSalary) {
		// TODO Auto-generated method stub
		System.out.println("edit succeed");
	}

	public void endSalary() {
		// TODO Auto-generated method stub
		System.out.println("end the salary");
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
