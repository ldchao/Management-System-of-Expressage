package nju.edu.businesslogic.loginbl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;

import PO.LoginPO;
import nju.edu.VO.UserVO;
import nju.edu.businesslogic.staffbl.UserBL;
import nju.edu.businesslogicservice.loginblservice.LoginBLService;
import nju.edu.presentation.Business_hall_salesmanui.Business_hall_salesmanMainUI;
import nju.edu.presentation.Transit_center_salesmanui.Transit_center_salesman_mainui;
import nju.edu.presentation.Transit_center_storemasterui.Transit_center_storemaster_mainui;
import nju.edu.presentation.courierui.Courier;
import nju.edu.presentation.financial_staffui.fsframe;
import nju.edu.presentation.general_managerui.Manager;
import nju.edu.presentation.system_administratorui.Administratorframe;

public class LoginBL implements LoginBLService {

	@Override
	public int isLegal(String user, String password) {
		int legal = -1;

		checkUserInfo check = new UserBL();
		ArrayList<UserVO> list = check.checkUsers();
		for (UserVO vo : list) {

			if (vo.getName().equals(user)) {
				if (vo.getKey().equals(password)) {
					legal = 1;
					break;
				} else {
					legal = 0;
					break;
				}
			}
		}

		return legal;
	}

	@Override
	public LoginPO getUserInfo(String user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Enter(JFrame main, String limit) {
		main.dispose();

		switch (limit) {
		case "快递员":
			Courier aCourier = new Courier();
			aCourier.setVisible(true);
			break;
		case "营业厅业务员":
			Business_hall_salesmanMainUI frame = new Business_hall_salesmanMainUI();
			frame.setVisible(true);
			break;
		case "中转中心业务员":
			Transit_center_salesman_mainui tcs = new Transit_center_salesman_mainui();
			tcs.setVisible(true);
			break;
		case "总经理":
			Manager mframe = new Manager();
			mframe.setVisible(true);
			break;
		case "财务人员":
			fsframe fs1 = new fsframe();
			break;
		case "高级财务人员":
			fsframe fs2 = new fsframe();
			break;
		case "中转中心仓库管理员":
			Transit_center_storemaster_mainui ts = new Transit_center_storemaster_mainui();
			ts.setVisible(true);
			break;
		case "系统管理员":
			Administratorframe ad = new Administratorframe();
			break;
		}
	}

	public void setUser(String user, String key) {
		try {
			FileWriter writer = new FileWriter(new File("src/Remember.txt"));
			writer.write(user + ";" + key);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String[] getUser() {
		String re[] = new String[2];
		File file = new File("src/Remember.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = reader.readLine();
			re = line.split(";");
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return re;
	}
}
