package nju.edu.businesslogicservice.accountblservice;

import java.util.ArrayList;

import nju.edu.VO.AccountVO;

public interface AccountBLService {

	// 查看所有账户
	public ArrayList<AccountVO> check();

	// 增加
	public void addAccount(String name, String money, String creator,
			String date);

	// 修改账户
	public ArrayList<AccountVO> updateAccount(int pos,String name, String creator, String date);

	// 根据账户名查找并删除账户
	public void deleteAccount(String name);

	// 根据关键字查找所有可能的账户
	public ArrayList<AccountVO> findAccount(String key);
}
