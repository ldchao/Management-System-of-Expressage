package Client.businesslogicservice.staffblservice;

import java.util.ArrayList;

import Client.VO.UserVO;

public interface UserBLService {

	// �½��û�
	public void addUser(String name, String key, String limit);

	// �޸��û�
	public ArrayList<UserVO> updateUser(int pos, String name, String limit);

	// ɾ���û�
	public void deleteUser(String name);

	// �鿴һ���û�
	public UserVO checkUser(String name);

	// �鿴�����û�
	public ArrayList<UserVO> checkUsers();

}
