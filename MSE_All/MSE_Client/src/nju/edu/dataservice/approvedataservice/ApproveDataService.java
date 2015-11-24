package nju.edu.dataservice.approvedataservice;

import java.util.ArrayList;

public interface ApproveDataService {
	public <T> ArrayList<T> get(int state,String type);
	
	public <T> T get(String name);
	
	public <T> void update(T t);
}
