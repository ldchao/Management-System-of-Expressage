package nju.edu.businesslogicservice.staffblservice;

import java.util.ArrayList;

import nju.edu.VO.UserVO;

public interface UserBLService {

	// 新建用户
	public boolean addUser(String name, String key, String limit);

	// 修改用户
	public ArrayList<UserVO> updateUser(int pos, String oldname, String name,
			String limit);

	// 删除用户
	public void deleteUser(String name);

	// 查看一个用户
	public UserVO checkUser(String name);

	// 查看所有用户
	public ArrayList<UserVO> checkUsers();

}