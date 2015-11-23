package Client.BL_Stub.listinBLService_Stub;

import Client.VO.OrderVO;
import Client.businesslogicservice.listinblservice.ListinBLService;
import State.ApproveState;
import State.ExpressType;
import State.PackageType;
import State.ResultMessage;

public class ListinBLService_Stub  implements ListinBLService{
	String courier;
	String phoneOfcourier;//派件员电话
	String id;
	int state;
	
	String sender;
	String address1;
	String position1;
	String phone1;
	String cellphone1;
	
	String receiver;
	String address2;
	String position2;
	String phone2;
	String cellphone2;
	String count;
	
	int weight;
	int length;
	int width;
	int height;
	String items;
	
	int express;
	int pack;
	double bill;
	String time;
	String transformState;

	//实际收件人信息
	String address; 
	String cellphone;
	
	public ListinBLService_Stub(String courier, String id, int state,
			String sender, String address1, String position1, String phone1,
			String cellphone1, String receiver, String address2,
			String position2, String phone2, String cellphone2, String count,
			int weight, int length, int width, int height, String items,
			int express, int pack, double bill, String time,
			String transformState) {
		super();
		this.courier = courier;
		this.id = id;
		this.state = state;
		this.sender = sender;
		this.address1 = address1;
		this.position1 = position1;
		this.phone1 = phone1;
		this.cellphone1 = cellphone1;
		this.receiver = receiver;
		this.address2 = address2;
		this.position2 = position2;
		this.phone2 = phone2;
		this.cellphone2 = cellphone2;
		this.count = count;
		this.weight = weight;
		this.length = length;
		this.width = width;
		this.height = height;
		this.items = items;
		this.express = express;
		this.pack = pack;
		this.bill = bill;
		this.time = time;
		this.transformState = transformState;
	}
	
	
	

	public ListinBLService_Stub(String courier, String phoneOfcourier,
			String id, String receiver, String time, String address,
			String cellphone) {
		super();
		this.courier = courier;
		this.phoneOfcourier = phoneOfcourier;
		this.id = id;
		this.receiver = receiver;
		this.time = time;
		this.address = address;
		this.cellphone = cellphone;
	}




	public void addOrder(String courier, String id, int state, String sender,
			String address1, String position1, String phone1,
			String cellphone1, String receiver, String address2,
			String position2, String phone2, String cellphone2, String count,
			int weight, int length, int width, int height, String items,
			int express, int pack, double bill, String time,
			String transformState) {
		// TODO Auto-generated method stub		
			System.out.println("add succeed!");
	}

	public double getTotalMoney(String address1, String address2, int length,
			int width, int height, int express, int pack) {
		// TODO Auto-generated method stub
		if(address1.equals("南京")&&address.equals("北京")&&length<1&&width<1&&height<1&&express==1&&pack==1)
		return 100;
		else
		return 0;
	}

	public String getTotalTime(String address1, String address2, int express) {
		// TODO Auto-generated method stub
		return "2015/10/1";
	}

	public void endAddOrder() {
		// TODO Auto-generated method stub
		System.out.println("end the adding of order");
	}

	public void addReceiver(String courier, String phoneOfcourier, String id,
			String receiver, String address, String time, String cellphone) {
		// TODO Auto-generated method stub
		System.out.println("add succeed!");
	}

	public void endAddReceiver() {
		// TODO Auto-generated method stub
		System.out.println("end the adding of receiver");
	}




	@Override
	public void addOrder(OrderVO vo) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public double getTotalMoney(String address1, String address2, String text, String text2, String text3,
			ExpressType express, PackageType pack) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public String getTotalTime(String address1, String address2, ExpressType express) {
		// TODO Auto-generated method stub
		return null;
	}







	
}