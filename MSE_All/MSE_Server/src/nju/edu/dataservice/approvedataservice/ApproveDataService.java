package nju.edu.dataservice.approvedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ApproveDataService extends Remote{
	public <T> ArrayList<T> get(int state,String type)throws RemoteException;
	
	public <T> T get(String name)throws RemoteException;
	
	public <T> void update(T t)throws RemoteException;
}
