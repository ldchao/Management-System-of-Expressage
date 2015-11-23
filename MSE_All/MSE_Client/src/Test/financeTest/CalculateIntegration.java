package Test.financeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Client.businesslogic.financebl.CalculateBL;
import Client.mockObject.financeMockObject.MockReceiForm;

public class CalculateIntegration {

	@Test
	public void test() {
		double[] payee = {40.5,9.5,50};
		MockReceiForm mockReceiForm = new MockReceiForm(payee);
		CalculateBL calculateBL = new CalculateBL();
		assertEquals(100, calculateBL.total(mockReceiForm.getPayee()),0);
	}

}
