package Server.Date_Stub.staffDateservice_Stub;

import java.util.ArrayList;

import PO.UserPO;
import Server.dataservice.staffdataservice.UserDataService;

public class UserDataService_Stub implements UserDataService{

	@Override
	public void insert(UserPO po) {
		// TODO Auto-generated method stub
		System.out.println("Insert Succeed!");
	}

	@Override
	public ArrayList<UserPO> update(UserPO po) {
		// TODO Auto-generated method stub
		System.out.println("Update Succeed!");
		return null;
	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		System.out.println("Delete Succeed!");
	}

	@Override
	public UserPO find(String name) {
		// TODO Auto-generated method stub
		System.out.println("Find Succeed!");
//		UserPO po = new UserPO();   // ���ʣ�
		return null;
	}

	@Override
	public ArrayList<UserPO> finds() {
		// TODO Auto-generated method stub
		ArrayList<UserPO> userList = new ArrayList<UserPO>();
//		userList.add(new UserPO());
		return userList;
	}

}
