package nju.edu.businesslogicservice.staffblservice;

import java.util.ArrayList;

import PO.StaffPO;
import nju.edu.VO.UserVO;

public interface UserBLService {

	// �½��û�
	public boolean addUser(String name, String key, String limit);

	// �޸��û�
	public ArrayList<UserVO> updateUser(int pos, String oldname, String name,
			String limit);

	// ɾ���û�
	public void deleteUser(String name);

	// �鿴һ���û�
	public UserVO checkUser(String name);

	// �鿴�����û�
	public ArrayList<UserVO> checkUsers();

	// �鿴û���˺ŵ���Ա
	public ArrayList<StaffPO> IDfromeManager();

	// �洢�½��˺ŵ���Ա
	public void IDtoManager(String newID, String newlimit, StaffPO po);

}