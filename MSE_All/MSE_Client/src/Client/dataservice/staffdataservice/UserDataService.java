package Client.dataservice.staffdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.UserPO;

public interface UserDataService extends Remote{

	// �½��û�
	public void insert(UserPO po)throws RemoteException;

	// �޸��û�
	public ArrayList<UserPO> update(UserPO po)throws RemoteException;

	// ɾ���û�
	public void delete(String name)throws RemoteException;

	// ����һ���û�
	public UserPO find(String name)throws RemoteException;

	// ���������û�
	public ArrayList<UserPO> finds()throws RemoteException;

}