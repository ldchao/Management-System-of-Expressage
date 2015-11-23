package Client.businesslogic.transferbl;

import java.util.ArrayList;

public class OrderList {
	
	
	ArrayList<String> idList=new ArrayList<String>();
	int[][][][] location=new int[3][4][3][5];
	
	public OrderList(int[][][][] location){
		this.location=location;
	}
	
	public void getList(){
//		MockWarehouse_inBL mw=new MockWarehouse_inBL();
//		idList=mw.getId(location);		
	}
	public double getSum(){
		double sum=0;
//		MockListinbl ml=new MockListinbl();
//		for (String s:idList) {
//			sum+=ml.getWeight(s);
//		}
//		
		return sum;
	}
	
	public double getDistance(){
		double distance=0;
//		
//		MockConstantPolicybl mc=new MockConstantPolicybl();
//		distance=mc.GetDistance("南京", "上海");
		return distance;
	}
	
	public double getFreight(){
		double freight=0;
		getList();
		double sum=getSum();
		double distance=getDistance();
		freight=sum*distance;
		
		return freight;
	}

}
