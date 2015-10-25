package Client.businesslogicservice.accountblservice;

import java.util.ArrayList;

import Client.PO.AccountPO;
import Client.VO.vo.AccountVO;

public interface AccountBLService {

	// 查看所有账户
	public ArrayList<AccountVO> check();

	// 增加
	public void insert(String name, double money, String creator, String date,
			int state);

	// 修改账户
	public void update(AccountPO po, String name, double money, String creator,
			String date, int state);

	// 根据账户名查找并删除账户
	public void delete(String name);

	// 根据关键字查找所有可能的账户
	public ArrayList<AccountVO> find(String key);
}
