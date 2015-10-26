package Client.BL_Stub.staffBLService_Stub;

import java.util.ArrayList;

import Client.PO.UserPO;
import Client.VO.PayorderVO;
import Client.VO.UserVO;
import Client.businesslogicservice.staffblservice.UserBLService;

public class UserBLService_Stub implements UserBLService{
	String userName; // 用户名
	String userKey; // 密码
	String userLimit; // 用户权限
	public UserBLService_Stub(String userName, String userKey, String userLimit) {
		super();
		this.userName = userName;
		this.userKey = userKey;
		this.userLimit = userLimit;
	}
	@Override
	public void addUser(String name, String key, String limit) {
		// TODO Auto-generated method stub
		System.out.println("Add Succeed!");
	}
	@Override
	public void updateUser(UserPO po, String name, String key, String limit) {
		// TODO Auto-generated method stub
		System.out.println("Update Succeed!");
	}
	@Override
	public void deleteUser(String name) {
		// TODO Auto-generated method stub
		System.out.println("Delete Succeed!");
	}
	@Override
	public UserVO checkUser(String name) {
		// TODO Auto-generated method stub
		return new UserVO();
	}
	@Override
	public ArrayList<UserVO> checkUsers() {
		// TODO Auto-generated method stub
		ArrayList<UserVO> userList = new ArrayList<UserVO>();
		userList.add(new UserVO());
		return userList;
	}
	
}
