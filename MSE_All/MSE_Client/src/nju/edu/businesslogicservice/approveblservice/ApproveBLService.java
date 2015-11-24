package nju.edu.businesslogicservice.approveblservice;

import java.util.ArrayList;

public interface ApproveBLService {
	public <T> ArrayList<T> showList(int state,String type);
	
	public <T> T checkList(String type);
	
	public <T> void editList(T t);
	
	public void endApprove();
}
