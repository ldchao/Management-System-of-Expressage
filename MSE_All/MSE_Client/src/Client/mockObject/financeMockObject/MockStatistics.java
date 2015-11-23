package Client.mockObject.financeMockObject;

import Client.businesslogic.financebl.StatisticsBL;

public class MockStatistics extends StatisticsBL {
	String name;

	public MockStatistics(String name) {
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
}
