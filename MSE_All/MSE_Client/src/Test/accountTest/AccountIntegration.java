package Test.accountTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Client.mockObject.accountMockObject.MockAccountBL;

public class AccountIntegration {

	@Test
	public void test() {
		MockAccountBL Account1 = new MockAccountBL("’Àªß1");
		assertEquals("’Àªß1",Account1.getAcName());
	}

}
