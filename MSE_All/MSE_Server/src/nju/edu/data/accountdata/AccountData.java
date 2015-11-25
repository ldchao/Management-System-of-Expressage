package nju.edu.data.accountdata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.data.FileIO.fileReader;
import nju.edu.data.FileIO.fileWriter;
import nju.edu.dataservice.accountdataservice.AccountDataService;
import PO.AccountPO;

public class AccountData extends UnicastRemoteObject implements
		AccountDataService {

	public AccountData() throws RemoteException {
		super();
	}

	@Override
	public void insert(AccountPO po) throws RemoteException {

		ArrayList<String> list = new ArrayList<String>();
		list.add(po.getName() + ";" + po.getMoney() + ";" + po.getCreator()
				+ ";" + po.getDate());
		fileWriter.Writer("DataBase/Account.txt", list, true);
	}

	@Override
	public ArrayList<AccountPO> update(AccountPO po, int pos)
			throws RemoteException {

		ArrayList<AccountPO> acplist = new ArrayList<>();
		ArrayList<String> file = fileReader.Reader("DataBase/Account.txt");
		ArrayList<String> list = new ArrayList<>();

		int count = 0;
		for (String str : file) {
			String part[] = str.split(";");
			count++;
			if (count != pos) {
				list.add(str);
				acplist.add(new AccountPO(part[0], part[1], part[2], part[3]));
			} else {
				acplist.add(new AccountPO(po.getName(), part[1], po.getDate(),
						po.getCreator()));
				list.add(po.getName() + ";" + part[1] + ";" + po.getDate()
						+ ";" + po.getCreator());
			}
		}

		fileWriter.Writer("DataBase/Account.txt", list, false);

		return acplist;
	}

	@Override
	public void delete(String name) throws RemoteException {

		ArrayList<String> filelist = fileReader.Reader("DataBase/Account.txt");
		ArrayList<String> list = new ArrayList<>();
		for (String str : filelist) {
			String part[] = str.split(";");
			if (!(part[0].equals(name)))
				list.add(str);
		}

		fileWriter.Writer("DataBase/Account.txt", list, false);
	}

	@Override
	public ArrayList<AccountPO> find(String key) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<AccountPO> check() throws RemoteException {
		
		ArrayList<AccountPO> aclist = new ArrayList<>();
		ArrayList<String> strlist = fileReader.Reader("DataBase/Account.txt");
		for (String str : strlist) {
			String part[] = str.split(";");
			aclist.add(new AccountPO(part[0], part[1], part[2], part[3]));
		}

		return aclist;
	}

}
