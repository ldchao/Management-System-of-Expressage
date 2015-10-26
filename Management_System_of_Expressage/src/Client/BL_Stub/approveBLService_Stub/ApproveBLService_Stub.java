package Client.BL_Stub.approveBLService_Stub;

import java.util.ArrayList;

import Client.businesslogicservice.approveblservice.ApproveBLService;

public class ApproveBLService_Stub implements ApproveBLService{
	
	public <T> ArrayList<T> showList(int state, String type) {
		// TODO Auto-generated method stub
		if(state==1&&type.equals("¶©µ¥")){
			ArrayList<T> list=new ArrayList<T>();
			list.add(null);
			return list;
		}else{
			return null;
		}
	}

	public <T> T checkList(String type) {
		// TODO Auto-generated method stub
		if(type.equals(" ")){
			return null;
		}else{
			return null;
		}
		
	}

	public <T> void editList(T t) {
		// TODO Auto-generated method stub
		System.out.println("edit succeed");
	}

	public void endApprove() {
		// TODO Auto-generated method stub
		System.out.println("end the approve");
		
	}

}
