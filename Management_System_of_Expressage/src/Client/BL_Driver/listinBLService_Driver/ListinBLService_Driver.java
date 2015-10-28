package Client.BL_Driver.listinBLService_Driver;

import Client.BL_Stub.listinBLService_Stub.ListinBLService_Stub;
import Client.businesslogicservice.listinblservice.ListinBLService;

public class ListinBLService_Driver {
	public void drive(String courier, String id, int state,
			String sender, String address1, String position1, String phone1,
			String cellphone1, String receiver, String address2,
			String position2, String phone2, String cellphone2, String count,
			int weight, int length, int width, int height, String items,
			int express, int pack, double bill, String time,
			String transformState) {
		ListinBLService lb=new ListinBLService_Stub(courier, id, state, 
				sender, address1, position1, phone1,
				cellphone1, receiver, address2, 
				position2, phone2, cellphone2, count, 
				weight, length, width, height, items, 
				express, pack, bill, time, transformState);
		lb.addOrder(courier, id, state, 
				sender, address1, position1, phone1,
				cellphone1, receiver, address2, 
				position2, phone2, cellphone2, count, 
				weight, length, width, height, items, 
				express, pack, bill, time, transformState);
	}

}
