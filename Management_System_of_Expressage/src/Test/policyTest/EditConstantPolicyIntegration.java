package Test.policyTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Client.mockObject.policyMockObject.MockConstantPolicybl;

public class EditConstantPolicyIntegration {

	@Test
	public void test() {
		MockConstantPolicybl mockConstantPolicybl=new MockConstantPolicybl();
		mockConstantPolicybl.editConstant("�Ͼ�", "����", 100, 0);
	}
}
