package Test.financeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Client.businesslogic.financebl.PayorderBL;
import Client.mockObject.financeMockObject.MockPayorder;
import Client.mockObject.financeMockObject.MockReceiForm;

public class PayorderIntegration {

	@Test
	public void test() {
		double pay[] = { 10.5, 39.5, 50 };
		MockPayorder mockPayorder = new MockPayorder(pay);
		double payee[] = { 29.5, 31.5, 40, 50 };
		MockReceiForm mockReceiForm = new MockReceiForm(payee);

		PayorderBL payorderBL = new PayorderBL();
//		assertEquals(251.0,
//				payorderBL.profit(mockPayorder.getPay(),
//						mockReceiForm.getPayee())[0], 0);
	}

}
