package Server.dataservice.staffdataservice;

import java.util.ArrayList;

import PO.UserPO;

public interface UserDataService {

	// �½��û�
	public void insert(UserPO po);

	// �޸��û�
	public void update(UserPO po);

	// ɾ���û�
	public void delete(String name);

	// ����һ���û�
	public UserPO find(String name);

	// ���������û�
	public ArrayList<UserPO> finds();

}
