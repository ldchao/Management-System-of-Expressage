package nju.edu.dataservice.staffdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.UserPO;

public interface UserDataService extends Remote{

	// 新建用户
	public void insert(UserPO po)throws RemoteException;

	// 修改用户
	public ArrayList<UserPO> update(int pos,UserPO po)throws RemoteException;

	// 删除用户
	public void delete(String name)throws RemoteException;

	// 查找一个用户
	public UserPO find(String name)throws RemoteException;

	// 查找所有用户
	public ArrayList<UserPO> finds()throws RemoteException;

}
