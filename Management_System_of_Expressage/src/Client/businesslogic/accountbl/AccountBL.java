package Client.businesslogic.accountbl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.ArrayList;

import Client.PO.AccountPO;
import Client.VO.AccountVO;
import Client.businesslogicservice.accountblservice.AccountBLService;
import Client.presentation.financial_staffui.CheckAccountframe;
import Client.presentation.financial_staffui.NewAccountframe;
import Client.presentation.general_managerui.checkAccount;

public class AccountBL implements AccountBLService {

	@Override
	public ArrayList<AccountVO> check() {
		ArrayList<AccountVO> aclist = new ArrayList<>();

		// ��ȡAccount.txt������ʾ�������
		File acfile = new File("DataBase/Account.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(acfile));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] str = line.split(";");
				AccountVO accountVO = new AccountVO(str[0], str[1], str[2],
						str[3]);
				aclist.add(accountVO);
			}

			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return aclist;
	}

	@Override
	public void addAccount(String name, double money, String creator,
			String date, int state) {

		ArrayList<String> list = new ArrayList<String>();
		File acfile = new File("DataBase/Account.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(acfile));
			String line;
			while ((line = reader.readLine()) != null)
				list.add(line);

			reader.close();

			list.add(name + ";" + money + ";" + creator + ";" + date);

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
	public ArrayList<AccountVO> updateAccount(int pos, String name, String creator,
			String date, int state) {

		ArrayList<AccountVO> list = new ArrayList<AccountVO>();
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
					list.add(new AccountVO(str[0], str[1], str[2], str[3]));
				} else {
					list.add(new AccountVO(name, str[1], date, creator));
					strlist.add(name + ";" + str[1] + ";" + date + ";"
							+ creator);
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

		return list;
	}

	@Override
	public void deleteAccount(String name) {

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
	public ArrayList<AccountVO> findAccount(String key) {
		// TODO Auto-generated method stub
		return null;
	}

}
