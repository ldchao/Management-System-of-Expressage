package Client.businesslogicservice.accountblservice;

import java.util.ArrayList;

import Client.VO.AccountVO;

public interface AccountBLService {

	// 查看所有账户
	public ArrayList<AccountVO> check();

	// 增加
	public void addAccount(String name, double money, String creator,
			String date, int state);

	// 修改账户
	public ArrayList<AccountVO> updateAccount(int pos,String name, String creator, String date,
			int state);

	// 根据账户名查找并删除账户
	public void deleteAccount(String name);

	// 根据关键字查找所有可能的账户
	public ArrayList<AccountVO> findAccount(String key);
}
