package Client.businesslogicservice.listinblservice;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import State.ResultMessage;

public interface ListinBLService {
	//ÐÂ½¨¶©µ¥
	public void addOrder(String courier, String id, int state, String sender,
			String address1, String position1, String phone1,
			String cellphone1, String receiver, String address2,
			String position2, String phone2, String cellphone2, String count,
			int weight, int length, int width, int height, String items,
			int express, int pack, double bill, String time,
			String transformState);
	
	public double getTotalMoney(String address1,String address2,int length,
					int width,int height,int express,int pack);
	
	public String getTotalTime(String address1,String address2,int express);
	
	public void endAddOrder();

}
