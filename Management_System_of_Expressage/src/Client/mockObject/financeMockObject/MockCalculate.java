package Client.mockObject.financeMockObject;

import Client.businesslogic.financebl.CalculateBL;

public class MockCalculate extends CalculateBL {
	double money;

	public MockCalculate(double money) {
		this.money = money;
	}

	public double getMoney() {
		return this.money;
	}
}
