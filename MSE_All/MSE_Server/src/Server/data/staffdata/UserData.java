package Server.data.staffdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import PO.UserPO;
import Server.dataservice.staffdataservice.UserDataService;

public class UserData extends UnicastRemoteObject implements UserDataService{

	protected UserData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insert(UserPO po) throws RemoteException{
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<UserPO> update(UserPO po) throws RemoteException{
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void delete(String name) throws RemoteException{
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserPO find(String name) throws RemoteException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<UserPO> finds() throws RemoteException{
		// TODO Auto-generated method stub
		return null;
	}

}
