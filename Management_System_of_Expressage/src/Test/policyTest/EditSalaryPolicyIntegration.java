package Test.policyTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Client.mockObject.policyMockObject.MockSalaryPolicybl;

public class EditSalaryPolicyIntegration {

	@Test
	public void test() {
		MockSalaryPolicybl mockSalaryPolicybl=new MockSalaryPolicybl();
		mockSalaryPolicybl.editSalary("¿ìµÝÔ±", " ", 1);
	}

}
