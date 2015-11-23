package Server.data.accountdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import PO.AccountPO;
import Server.dataservice.accountdataservice.AccountDataService;

public class AccountData extends UnicastRemoteObject implements AccountDataService{

	protected AccountData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insert(AccountPO po)throws RemoteException{
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<AccountPO> update(AccountPO po) throws RemoteException{		
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void delete(String name)throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<AccountPO> find(String key)throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<AccountPO> check() throws RemoteException{
		// TODO Auto-generated method stub
		return null;
	}

}
