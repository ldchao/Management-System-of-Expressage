package nju.edu.businesslogicservice.approveblservice;

import java.util.ArrayList;

import PO.OrderPO;

public interface ApproveBLService {
	//获取相应类型的所有单据信息
	public ArrayList<String> showList(String type);
	
	//审批单据
	public void editList(int num,String type);
	
}
