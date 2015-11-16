package Client.mockObject.billMockObject;

import Client.businesslogic.billbl.BillBL;

public class MockBill extends BillBL{
	String name;
	
	public MockBill(String name){
		this.name = name;
	}
	
	public String getname(){
		return this.name;
	}
}
