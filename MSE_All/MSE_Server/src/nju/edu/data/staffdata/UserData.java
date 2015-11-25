package nju.edu.data.staffdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.staffdataservice.UserDataService;
import PO.UserPO;

@SuppressWarnings("serial")
public class UserData extends UnicastRemoteObject implements UserDataService {

	public UserData() throws RemoteException {
		super();
	}

	@Override
	public void insert(UserPO po) throws RemoteException {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add(po.getName() + ";" + po.getKey() + ";" + po.getLimit());
		fileWriter.Writer("DataBase/User.txt", arrayList, true);
	}

	@Override
	public ArrayList<UserPO> update(int pos, UserPO po) throws RemoteException {

		ArrayList<UserPO> userList = new ArrayList<>();
		ArrayList<String> filelist = fileReader.Reader("DataBase/User.txt");
		ArrayList<String> list = new ArrayList<>();

		int count = 0;
		for (String fl : filelist) {
			String str[] = fl.split(";");
			count++;
			if (count != pos) {
				list.add(fl);
				userList.add(new UserPO(str[0], str[1], str[2]));
			} else {
				list.add(po.getName() + ";" + str[1] + ";" + po.getLimit());
				userList.add(new UserPO(po.getName(), str[1], po.getLimit()));
			}
		}

		fileWriter.Writer("DataBase/User.txt", list, false);

		return userList;
	}

	@Override
	public void delete(String name) throws RemoteException {

		ArrayList<String> filelist = fileReader.Reader("DataBase/User.txt");
		ArrayList<String> list = new ArrayList<>();

		for (String fl : filelist) {
			String str[] = fl.split(";");
			if (!str[0].equals(name))
				list.add(fl);
		}

		fileWriter.Writer("DataBase/User.txt", list, false);
	}

	@Override
	public UserPO find(String name) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<UserPO> finds() throws RemoteException {

		ArrayList<UserPO> userlist = new ArrayList<>();
		ArrayList<String> filelist = fileReader.Reader("DataBase/User.txt");
		for (String fl : filelist) {
			String str[] = fl.split(";");
			userlist.add(new UserPO(str[0], str[1], str[2]));
		}
		
		return userlist;
	}
}
