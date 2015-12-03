package nju.edu.businesslogicservice.transferblservice;

import java.util.ArrayList;

public interface StoreinInfo {

	//根据库位得到对应位置的订单编号
	
	//得到发往外市中转中心的订单编号
	public ArrayList<String> getId(String qu,int pai,int[] jia);
	
	//得到发往本市营业厅的订单编号
	public ArrayList<String> getId(int jia,int[] wei);
}
