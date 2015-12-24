package nju.edu.businesslogicservice.approveblservice;

import java.util.ArrayList;

import PO.OrderPO;

public interface ApproveBLService {
	public ArrayList<String> showList(String type);
	
	public void editList(int num,String type);
	
}
