package Test.accountTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Client.mockObject.accountMockObject.MockAccountBL;

public class AccountIntegration {

	@Test
	public void test() {
		MockAccountBL Account1 = new MockAccountBL("�˻�1");
		assertEquals("�˻�1",Account1.getAcName());
	}

}
