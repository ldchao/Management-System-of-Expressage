package Test.policyTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Client.mockObject.policyMockObject.MockSalaryPolicybl;

public class CheckSalaryPolicyIntegration {

	@Test
	public void test() {
		MockSalaryPolicybl mockSalaryPolicybl=new MockSalaryPolicybl();
		System.out.println(mockSalaryPolicybl.checkSalary("���Ա").getTypeOfStaff());
		assertEquals("���Ա", mockSalaryPolicybl.checkSalary("���Ա").getTypeOfStaff());
	}

}
