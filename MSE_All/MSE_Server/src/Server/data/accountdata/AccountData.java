package Server.data.accountdata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import PO.AccountPO;
import Server.dataservice.accountdataservice.AccountDataService;

public class AccountData extends UnicastRemoteObject implements
		AccountDataService {

	protected AccountData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insert(AccountPO po) throws RemoteException {
		ArrayList<String> list = new ArrayList<String>();
		File acfile = new File("DataBase/Account.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(acfile));
			String line;
			while ((line = reader.readLine()) != null)
				list.add(line);

			reader.close();

			list.add(po.getName() + ";" + po.getMoney() + ";" + po.getCreator()
					+ ";" + po.getDate());

			FileWriter writer = new FileWriter(acfile);
			for (String str : list) {
				writer.write(str + "\n");
			}
			writer.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public ArrayList<AccountPO> update(AccountPO po,int pos) throws RemoteException {
		ArrayList<AccountPO> acplist = new ArrayList<>();
		
		ArrayList<String> strlist = new ArrayList<>();
		File acfile = new File("DataBase/Account.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(acfile));
			int count = 0;
			String line;
			while ((line = reader.readLine()) != null) {
				String str[] = line.split(";");
				count++;
				if (count != pos) {
					strlist.add(line);
					acplist.add(new AccountPO(str[0], str[1], str[2], str[3]));
				} else {
					acplist.add(new AccountPO(po.getName(), str[1], po.getDate(), po.getCreator()));
					strlist.add(po.getName() + ";" + str[1] + ";" + po.getDate() + ";"
							+ po.getCreator());
				}
			}
			reader.close();

			FileWriter writer = new FileWriter(acfile);
			for (String str : strlist) {
				writer.write(str + "\n");
			}
			writer.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return acplist;
	}

	@Override
	public void delete(String name) throws RemoteException {

		File acfile = new File("DataBase/Account.txt");
		ArrayList<String> list = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(acfile));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] str = line.split(";");
				if (!(str[0].equals(name)))
					list.add(line);

			}
			reader.close();

			FileWriter writer = new FileWriter(acfile);
			for (String str : list) {
				writer.write(str + "\n");
			}
			writer.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Override
	public ArrayList<AccountPO> find(String key) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<AccountPO> check() throws RemoteException {
		ArrayList<AccountPO> aclist = new ArrayList<>();

		// 读取Account.txt，并显示到表格中
		File acfile = new File("DataBase/Account.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(acfile));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] str = line.split(";");
				AccountPO accountPO = new AccountPO(str[0], str[1], str[2],
						str[3]);
				aclist.add(accountPO);
			}

			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return aclist;
	}

}
