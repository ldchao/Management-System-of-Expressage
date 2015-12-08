package nju.edu.dataservice.staffdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.StaffPO;

public interface StaffDataService extends Remote{
	public ArrayList<StaffPO> gets()throws RemoteException;
	
	public StaffPO get(String name)throws RemoteException;
	
	public void insert(StaffPO po)throws RemoteException;
	
	public void delete(String id)throws RemoteException;
	
	public void update(StaffPO po)throws RemoteException;
	
	//�޸��û���,ǰһ��Ϊ���û�������һ��Ϊ���û���
	public void editTheID(String oldID,String newID,String position)throws RemoteException;
}
