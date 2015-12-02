package nju.edu.businesslogicservice.transferblservice;

import java.util.ArrayList;

public interface StoreinInfo {

	//根据库位得到对应位置的订单编号
	
	public ArrayList<String> getId(int location[][][][]);
}
