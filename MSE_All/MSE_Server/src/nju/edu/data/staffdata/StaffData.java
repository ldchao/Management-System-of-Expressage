package nju.edu.data.staffdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import PO.StaffPO;
import nju.edu.dataservice.staffdataservice.StaffDataService;

public class StaffData extends UnicastRemoteObject implements StaffDataService{

	public StaffData() throws RemoteException{
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ArrayList<StaffPO> gets() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StaffPO get(String name) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(StaffPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(StaffPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(StaffPO po) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	
}
