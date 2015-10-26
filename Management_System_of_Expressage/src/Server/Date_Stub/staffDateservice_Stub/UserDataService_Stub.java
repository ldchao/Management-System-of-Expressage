package Server.Date_Stub.staffDateservice_Stub;

import java.util.ArrayList;

import Client.PO.UserPO;
import Client.VO.UserVO;
import Server.dataservice.staffdataservice.UserDataService;

public class UserDataService_Stub implements UserDataService{

	@Override
	public void insert(UserPO po) {
		// TODO Auto-generated method stub
		System.out.println("Insert Succeed!");
	}

	@Override
	public void update(UserPO po) {
		// TODO Auto-generated method stub
		System.out.println("Update Succeed!");
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
		UserPO po = new UserPO();   // “…Œ £°
		return po;
	}

	@Override
	public ArrayList<UserPO> finds() {
		// TODO Auto-generated method stub
		ArrayList<UserPO> userList = new ArrayList<UserPO>();
		userList.add(new UserPO());
		return userList;
	}

}
