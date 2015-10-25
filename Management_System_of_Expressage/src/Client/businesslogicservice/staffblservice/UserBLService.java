package Client.businesslogicservice.staffblservice;

import java.util.ArrayList;

import Client.PO.UserPO;
import Client.VO.UserVO;

public interface UserBLService {

	// 新建用户
	public void insert(String name, String key, String limit);

	// 修改用户
	public void update(UserPO po, String name, String key, String limit);

	// 删除用户
	public void delete(String name);

	// 查看一个用户
	public UserVO check(String name);

	// 查看所有用户
	public ArrayList<UserVO> checks();

}
