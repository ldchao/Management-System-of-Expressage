package Test.policyTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Client.mockObject.policyMockObject.MockConstantPolicybl;

public class CheckConstantPolicyIntegration {

	@Test
	public void test() {
		MockConstantPolicybl mockConstantPolicybl=new MockConstantPolicybl();
		assertEquals(100, mockConstantPolicybl.checkConstant("�Ͼ�", "����").getDistance(),0);
	}

}
