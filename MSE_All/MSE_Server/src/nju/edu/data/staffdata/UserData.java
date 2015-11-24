package nju.edu.data.staffdata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.dataservice.staffdataservice.UserDataService;
import PO.UserPO;

public class UserData extends UnicastRemoteObject implements UserDataService {

	public UserData() throws RemoteException {
		super();
	}

	@Override
	public void insert(UserPO po) throws RemoteException {
		ArrayList<String> arrayList = new ArrayList<String>();
		File userfile = new File("DataBase/User.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(userfile));
			String line;
			while ((line = reader.readLine()) != null)
				arrayList.add(line);

			reader.close();

			arrayList.add(po.getName() + ";" + po.getKey() + ";"
					+ po.getLimit());

			FileWriter writer = new FileWriter(userfile);
			for (String str : arrayList) {
				writer.write(str + "\n");
			}
			writer.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public ArrayList<UserPO> update(int pos, UserPO po) throws RemoteException {

		ArrayList<UserPO> userList = new ArrayList<>();
		ArrayList<String> strlist = new ArrayList<>();
		File userfile = new File("DataBase/User.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(userfile));
			int count = 0;
			String line;
			while ((line = reader.readLine()) != null) {
				String str[] = line.split(";");
				count++;
				if (count != pos) {
					strlist.add(line);
					userList.add(new UserPO(str[0], str[1], str[2]));
				} else {
					userList.add(new UserPO(po.getName(), str[1], po.getLimit()));
					strlist.add(po.getName() + ";" + str[1] + ";"
							+ po.getLimit());
				}
			}
			reader.close();

			FileWriter writer = new FileWriter(userfile);
			for (String str : strlist) {
				writer.write(str + "\n");
			}
			writer.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return userList;
	}

	@Override
	public void delete(String name) throws RemoteException {

		File userfile = new File("DataBase/User.txt");
		ArrayList<String> list = new ArrayList<String>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(userfile));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] str = line.split(";");
				if (!(str[0].equals(name)))
					list.add(line);
			}
			reader.close();

			FileWriter writer = new FileWriter(userfile);
			for (String str : list) {
				writer.write(str + "\n");
			}
			writer.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public UserPO find(String name) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<UserPO> finds() throws RemoteException {

		ArrayList<UserPO> userlist = new ArrayList<>();
		// 读取User.txt，并显示到表格中
		File userfile = new File("DataBase/User.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(userfile));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] str = line.split(";");
				UserPO userPO = new UserPO(str[0], str[1], str[2]);
				userlist.add(userPO);
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return userlist;
	}

}
