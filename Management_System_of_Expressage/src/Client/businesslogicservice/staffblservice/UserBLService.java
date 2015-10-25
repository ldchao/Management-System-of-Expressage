package Client.businesslogicservice.staffblservice;

import java.util.ArrayList;

import Client.PO.UserPO;
import Client.VO.UserVO;

public interface UserBLService {

	// �½��û�
	public void insert(String name, String key, String limit);

	// �޸��û�
	public void update(UserPO po, String name, String key, String limit);

	// ɾ���û�
	public void delete(String name);

	// �鿴һ���û�
	public UserVO check(String name);

	// �鿴�����û�
	public ArrayList<UserVO> checks();

}
