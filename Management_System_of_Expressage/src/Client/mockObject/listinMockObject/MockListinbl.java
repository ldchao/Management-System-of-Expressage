package Client.mockObject.listinMockObject;

import Client.businesslogic.listinbl.Listinbl;
import Client.mockObject.policyMockObject.MockConstantPolicybl;

public class MockListinbl extends Listinbl{
	
	
	public void addOrder(String courier, String id, int state, String sender, String address1,
			String position1, String phone1, String cellphone1, String receiver, String address2, String position2,
			String phone2, String cellphone2, String count, int weight, int length, int width, int height, String items,
			int express, int pack, double bill, String time, String transformState) {
		MockReceiverinbl
		// TODO Auto-generated method stub
	}
	
	
	public double getTotalMoney(String address1, String address2, int length, int width, int height, int express,
			int pack) {
		// TODO Auto-generated method stub
		double result=0;
		double part1;//����֮��ľ���ͼ۸�
		double part2;//����������۸�
		double part3;//�������
		double part4;//��װ����
		
		MockConstantPolicybl MockConstant=new MockConstantPolicybl();
		part1=MockConstant.GetDistance(address1, address2)*MockConstant.GetMoney(address1, address2);
		part2=WeightPrice(length,width,height);
		part3=ExpressPrice(express);
		part4=PackPrice(pack);
		result=part1+part2+part3+part4;
		return result;
	}
}
