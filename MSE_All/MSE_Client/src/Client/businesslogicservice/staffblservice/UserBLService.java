package Client.businesslogicservice.staffblservice;

import java.util.ArrayList;

import Client.VO.UserVO;

public interface UserBLService {

	// 新建用户
	public void addUser(String name, String key, String limit);

	// 修改用户
	public ArrayList<UserVO> updateUser(int pos, String name, String limit);

	// 删除用户
	public void deleteUser(String name);

	// 查看一个用户
	public UserVO checkUser(String name);

	// 查看所有用户
	public ArrayList<UserVO> checkUsers();

}
