package Test.policyTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Client.mockObject.policyMockObject.MockSalaryPolicybl;

public class CheckSalaryPolicyIntegration {

	@Test
	public void test() {
		MockSalaryPolicybl mockSalaryPolicybl=new MockSalaryPolicybl();
		System.out.println(mockSalaryPolicybl.checkSalary("快递员").getTypeOfStaff());
		assertEquals("快递员", mockSalaryPolicybl.checkSalary("快递员").getTypeOfStaff());
	}

}
