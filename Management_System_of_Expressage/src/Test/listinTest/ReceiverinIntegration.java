package Test.listinTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Client.mockObject.listinMockObject.MockReceiverinbl;

public class ReceiverinIntegration {

	@Test
	public void test() {
		MockReceiverinbl mockReceiverinbl=new MockReceiverinbl();
		mockReceiverinbl.addReceiver("Frebin", "110110110", "1111111111", "shaque", "ÄÏ¾©", "", "110110110");
	}

}
