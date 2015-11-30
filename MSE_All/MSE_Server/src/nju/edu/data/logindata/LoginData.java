package nju.edu.data.logindata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.logindataservice.LoginDataService;

@SuppressWarnings("serial")
public class LoginData extends UnicastRemoteObject implements LoginDataService {

	public LoginData() throws RemoteException {
		super();
	}

	@Override
	public void setUser(String user, String key) throws RemoteException {

		fileWriter.Writer("DataBase/Remember.txt", user + ";" + key, false);
	}

	@Override
	public String[] getUser() throws RemoteException {
		String re[] = new String[2];
		ArrayList<String> list = fileReader.Reader("DataBase/Remember.txt");
		re = list.get(0).split(";");

		return re;
	}

}
