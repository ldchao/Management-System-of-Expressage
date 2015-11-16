package Client.businesslogic.staffbl;

import java.util.ArrayList;

import Client.PO.UserPO;
import Client.VO.UserVO;
import Client.businesslogicservice.staffblservice.UserBLService;

public class UserBL implements UserBLService{

	@Override
	public void addUser(String name, String key, String limit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(UserPO po, String name, String key, String limit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserVO checkUser(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<UserVO> checkUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
