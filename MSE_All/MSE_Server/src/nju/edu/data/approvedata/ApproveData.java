package nju.edu.data.approvedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.dataservice.approvedataservice.ApproveDataService;

public class ApproveData extends UnicastRemoteObject implements ApproveDataService{
	
	public ApproveData() throws RemoteException{
		// TODO Auto-generated constructor stub
		super();
	}
	
	@Override
	public <T> ArrayList<T> get(int state, String type) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T get(String name) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> void update(T t) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
