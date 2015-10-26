package Server.Date_Stub.approveDateservice_Stub;

import java.util.ArrayList;

import Server.dataservice.approvedataservice.ApproveDataService;

public class ApproveDataService_Stub implements ApproveDataService{
	int state;
	String type;
	
	public ApproveDataService_Stub(int state, String type) {
		super();
		this.state = state;
		this.type = type;
	}

	public <T> ArrayList<T> get(int state, String type) {
		// TODO Auto-generated method stub
		ArrayList<T> list=new ArrayList<T>();
		return list;
	}

	public <T> T get(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> void update(T t) {
		// TODO Auto-generated method stub
		System.out.println("update succeed");
	}

}
