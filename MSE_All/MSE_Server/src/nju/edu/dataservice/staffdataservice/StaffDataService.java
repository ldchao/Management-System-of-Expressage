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
	
	//修改用户名,前一个为旧用户名，后一个为新用户名
	public void editTheID(String oldID,String newID,String position)throws RemoteException;

	//获取人员初始编号
	public int getnum() throws RemoteException;

	//获取所有没有获得用户名的人员的po的arrayList
	public ArrayList<StaffPO> getAllStaff() throws RemoteException;

	//因为获得用户名，删除原文件并增添至新文件
	public void exchange(String id, StaffPO po)throws RemoteException;
}
