package Client.dataservice.accountdataservice;

import java.util.ArrayList;

import Client.PO.AccountPO;
import Client.VO.AccountVO;

public interface AccountDataService {

	// 增加账户
	public void insert(AccountPO po);

	// 修改账户
	public void update(AccountPO po);

	// 根据账户名查找并删除账户
	public void delete(String name);

	// 根据关键字查找所有可能的账户
	public ArrayList<AccountVO> find(String key);
}
