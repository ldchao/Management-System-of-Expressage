package Client.mockObject.staffMockObject;

import Client.businesslogic.staffbl.UserBL;

public class MockUser extends UserBL{
	String name;

	public MockUser(String name) {
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}

}
