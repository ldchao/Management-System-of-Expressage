package Test.approveTest;

import java.util.ArrayList;

import org.junit.Test;

import Client.mockObject.approveMockObject.MockApprovebl;

public class showListIntegration {

	@Test
	public  void test() {
		MockApprovebl mockApprovebl=new MockApprovebl();
		ArrayList<String> arrayList=mockApprovebl.showList(1, " ");
	}

}
