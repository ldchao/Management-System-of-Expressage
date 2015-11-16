package Test.listinTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Client.businesslogic.listinbl.Listinbl;
import Client.mockObject.listinMockObject.MockListinbl;

public class TotalMoneyIntegration {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		MockListinbl listinbl=new MockListinbl();
//		System.out.println(listinbl.getTotalMoney("南京","北京", 20, 10, 15, 2, 1));
		assertEquals(130.0, listinbl.getTotalMoney("南京","北京", 20, 10, 15, 2, 1),0);
	}

}
