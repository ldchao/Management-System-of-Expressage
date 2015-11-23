package Test.transferTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Client.businesslogic.transferbl.OrderList;

public class Freight_test {

	@Test
	public void test() {
		int[][][][] test=new int[3][4][3][5];
		for(int i=0;i<3;i++){
			for (int j = 0; j < 4; j++) {
				for (int j2 = 0; j2 <3; j2++) {
					for (int k = 0; k < 5; k++) {
						test[i][j][j2][k]=0;
					}
				}
			}						
		}
		test[0][0][0][0]=1;
		
		OrderList ol=new OrderList(test);
		
		assertEquals(1000, ol.getFreight(),0);
	}

}
