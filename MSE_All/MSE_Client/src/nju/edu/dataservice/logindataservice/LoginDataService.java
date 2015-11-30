package nju.edu.dataservice.logindataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LoginDataService extends Remote{

	public void setUser(String user, String key) throws RemoteException;

	public String[] getUser() throws RemoteException;
}
