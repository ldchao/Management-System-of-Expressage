package Client.businesslogic.staffbl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import Client.PO.UserPO;
import Client.VO.AccountVO;
import Client.VO.UserVO;
import Client.businesslogicservice.staffblservice.UserBLService;

public class UserBL implements UserBLService {

	@Override
	public void addUser(String name, String key, String limit) {

		ArrayList<String> arrayList = new ArrayList<String>();
		File userfile = new File("DataBase/User.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(userfile));
			String line;
			while ((line = reader.readLine()) != null)
				arrayList.add(line);

			reader.close();

			arrayList.add(name + ";" + key + ";" + limit);

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
	public void updateUser(UserPO po, String name, String key, String limit) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(String name) {
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
	public UserVO checkUser(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<UserVO> checkUsers() {
		ArrayList<UserVO> userlist = new ArrayList<>();

		// 读取Account.txt，并显示到表格中
		File userfile = new File("DataBase/User.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(userfile));
			String line;
			int i = 0;
			while ((line = reader.readLine()) != null) {
				String[] str = line.split(";");
				UserVO userVO = new UserVO(str[0], str[1], str[2]);
				userlist.add(userVO);
			}

			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return userlist;
	}

}
