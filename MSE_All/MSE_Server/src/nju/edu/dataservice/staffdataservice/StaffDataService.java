package nju.edu.dataservice.staffdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.StaffPO;

public interface StaffDataService extends Remote{
	public ArrayList<StaffPO> gets()throws RemoteException;
	
	public StaffPO get(String name)throws RemoteException;
	
	public void insert(StaffPO po)throws RemoteException;
	
	public void delete(StaffPO po)throws RemoteException;
	
	public void update(StaffPO po)throws RemoteException;
	
}
