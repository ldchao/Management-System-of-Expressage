package Client.businesslogic.listinbl;

import com.sun.xml.internal.ws.policy.Policy;

import Client.businesslogic.policybl.ConstantPolicybl;
import Client.businesslogic.policybl.SalaryPolicybl;
import Client.businesslogicservice.listinblservice.ListinBLService;
import Client.businesslogicservice.policyblservice.SalaryPolicyBLSerivce;
import Client.mockObject.policyMockObject.MockConstantPolicybl;
import State.ResultMessage;

public class Listinbl implements ListinBLService{

	@Override
	public void addOrder(String courier, String id, int state, String sender, String address1,
			String position1, String phone1, String cellphone1, String receiver, String address2, String position2,
			String phone2, String cellphone2, String count, int weight, int length, int width, int height, String items,
			int express, int pack, double bill, String time, String transformState) {
		// TODO Auto-generated method stub
	}

	@Override
	public double getTotalMoney(String address1, String address2, int length, int width, int height, int express,
			int pack) {
		// TODO Auto-generated method stub
		double result=0;
		return result;
	}

	protected double PackPrice(int pack) {
		// TODO Auto-generated method stub
		if(pack==1){
			return 5;
		}else if(pack==2){
			return 10;
		}else{
			return 15;
		}
	}

	protected double ExpressPrice(int express) {
		// TODO Auto-generated method stub
		if(express==1){
			return 5;
		}else if(express==2){
			return 15;
		}else{
			return 30;
		}

	}

	protected double WeightPrice(int length, int width, int height) {
		// TODO Auto-generated method stub
		if(length*width*height>50000){
			return length*width*height/5000;
		}else{
			return 10;
		}
	}

	@Override
	public String getTotalTime(String address1, String address2, int express) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void endAddOrder() {
		// TODO Auto-generated method stub
		
	}

}
