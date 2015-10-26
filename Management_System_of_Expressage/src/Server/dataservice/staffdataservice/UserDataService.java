package Server.dataservice.staffdataservice;

import java.util.ArrayList;

import Client.PO.UserPO;
import Client.VO.UserVO;

public interface UserDataService {

	// �½��û�
	public void insert(UserPO po);

	// �޸��û�
	public void update(UserPO po);

	// ɾ���û�
	public void delete(String name);

	// ����һ���û�
	public UserVO find(String name);

	// ���������û�
	public ArrayList<UserVO> finds();

}
