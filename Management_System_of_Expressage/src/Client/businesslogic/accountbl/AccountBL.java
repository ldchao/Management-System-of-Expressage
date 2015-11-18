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
import Client.presentation.general_managerui.checkAccount;

public class AccountBL implements AccountBLService {

	@Override
	public ArrayList<AccountVO> check() {
		ArrayList<AccountVO> aclist = new ArrayList<>();

		// 读取Account.txt，并显示到表格中
		File acfile = new File("DataBase/Account.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(acfile));
			String line;
			int i = 0;
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
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAccount(AccountPO po, String name, double money,
			String creator, String date, int state) {
		// TODO Auto-generated method stub

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
