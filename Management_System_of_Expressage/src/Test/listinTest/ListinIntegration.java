package Test.listinTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Client.businesslogic.listinbl.Listinbl;
import Client.mockObject.listinMockObject.MockListinbl;

public class ListinIntegration {

	@Test
	public void test() {
		MockListinbl mocklistinbl=new MockListinbl(); 
		mocklistinbl.addOrder("Frebin", "1101101101", 1, "chao", "南京", " ", "11011011011", "66xxxxx", 
				"monitor", "北京", " ", "11011011011", "66xxxxx", "1", 10, 10, 20, 20, "chongqiwawa", 1, 1, 130, "10", " ");
	}

}
