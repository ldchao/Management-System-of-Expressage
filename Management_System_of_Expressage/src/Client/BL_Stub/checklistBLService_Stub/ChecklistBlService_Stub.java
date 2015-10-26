package Client.BL_Stub.checklistBLService_Stub;

import Client.VO.OrderVO;
import Client.businesslogicservice.checklistblservice.*;

public class ChecklistBlService_Stub implements ChecklistBlService{
	
	//快递员和订单号和单据审批状态
		String courier;
		String id;
		int state;
		
		//寄件人信息
		String sender;
		String address1;
		String position1;
		String phone1;
		String cellphone1;
		
		//收件人信息
		String receiver;
		String address2;
		String position2;
		String phone2;
		String cellphone2;
		
		//寄件信息
		String count;
		int weight;
		int length;
		int width;
		int height;
		String items;
		
		//快递种类
		int express;
		
		//包装类型
		int pack;
		
		//付款和预计时间
		double bill;
		String time;

		//物流信息
		String transformState;
		
		

	public ChecklistBlService_Stub(String courier, String id, int state, String sender, String address1,
				String position1, String phone1, String cellphone1, String receiver, String address2, String position2,
				String phone2, String cellphone2, String count, int weight, int length, int width, int height,
				String items, int express, int pack, double bill, String time, String transformState) {
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



	@Override
	public OrderVO getOrder(String id) {
		return new OrderVO(courier,id , state, sender,
				address1, position1, phone1,
				cellphone1, receiver, address2,
				position2,phone2, cellphone2, count,
				weight, length, width, height, items,
				express, pack, bill, time,
				transformState);
	}
     
}
