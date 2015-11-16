package Test.approveTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import Client.PO.ReceiverPO;
import Client.mockObject.approveMockObject.MockApprovebl;

public class showListIntegration {

	@Test
	public  void test() {
		MockApprovebl mockApprovebl=new MockApprovebl();
		ArrayList<String> arrayList=mockApprovebl.showList(1, " ");
	}

}
