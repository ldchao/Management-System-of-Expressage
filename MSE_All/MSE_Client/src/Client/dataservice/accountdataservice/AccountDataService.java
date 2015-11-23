package Client.dataservice.accountdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.AccountPO;

public interface AccountDataService extends Remote {

	// 增加账户
	public void insert(AccountPO po) throws RemoteException;

	// 修改账户
	public ArrayList<AccountPO> update(AccountPO po, int pos)
			throws RemoteException;

	// 根据账户名查找并删除账户
	public void delete(String name) throws RemoteException;

	// 查看所有账户
	public ArrayList<AccountPO> check() throws RemoteException;

	// 根据关键字查找所有可能的账户
	public ArrayList<AccountPO> find(String key) throws RemoteException;
}
