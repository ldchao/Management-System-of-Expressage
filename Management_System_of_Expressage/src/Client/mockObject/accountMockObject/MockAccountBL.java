package Client.mockObject.accountMockObject;

import Client.businesslogic.accountbl.AccountBL;

public class MockAccountBL extends AccountBL{
	String name;
	
	public MockAccountBL(String name){
		super();
		this.name = name;
	}
	
	public String getAcName(){
		return this.name;
	}
}
