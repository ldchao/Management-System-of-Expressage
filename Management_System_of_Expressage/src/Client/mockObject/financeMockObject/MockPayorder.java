package Client.mockObject.financeMockObject;

import Client.businesslogic.financebl.PayorderBL;

public class MockPayorder extends PayorderBL{
    double[] pay;
	
	public MockPayorder(double[] pay) {
		this.pay = pay;
	}
	
	public double[] getPay(){
		return this.pay;
	}
	
}
