package Server.dataservice.staffdataservice;

import java.util.ArrayList;

import Client.PO.UserPO;
import Client.VO.UserVO;

public interface UserDataService {

	// 新建用户
	public void insert(UserPO po);

	// 修改用户
	public void update(UserPO po);

	// 删除用户
	public void delete(String name);

	// 查找一个用户
	public UserVO find(String name);

	// 查找所有用户
	public ArrayList<UserVO> finds();

}
