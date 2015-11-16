package Test.approveTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import Client.mockObject.approveMockObject.MockApprovebl;

public class showListIntegration {

	@Test
	public <T> void test() {
		MockApprovebl mockApprovebl=new MockApprovebl();
		ArrayList<T> arrayList=	mockApprovebl.showList(1, " ");
	}

}
