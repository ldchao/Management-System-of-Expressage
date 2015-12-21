package nju.edu.businesslogic.loginbl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;

import PO.LoginPO;
import PO.StaffPO;
import nju.edu.VO.UserVO;
import nju.edu.businesslogic.staffbl.Staffbl;
import nju.edu.businesslogic.staffbl.UserBL;
import nju.edu.businesslogicservice.loginblservice.LoginBLService;
import nju.edu.presentation.Business_hall_salesmanui.Business_hall_salesmanMainUI;
import nju.edu.presentation.Transit_center_salesmanui.Transit_center_salesman_mainui;
import nju.edu.presentation.Transit_center_storemasterui.Transit_center_storemaster_mainui;
import nju.edu.presentation.courierui.Courier;
import nju.edu.presentation.courierui.CourierFrame;
import nju.edu.presentation.financial_staffui.FinanceFrame;
import nju.edu.presentation.general_managerui.Manager;
import nju.edu.presentation.general_managerui.ManagerFrame;
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
	public LoginPO getUserInfo(String user, String password) {

		checkStaffInfo checkStaff = new Staffbl();
		StaffPO staffPO = checkStaff.getStaffPO(user);
		LoginPO loginPO = new LoginPO(user, password, staffPO.getPosition(),
				staffPO.getName(), staffPO.getShop());

		return loginPO;
	}

	@Override
	public void Enter(JFrame main, LoginPO loginPO) {
		main.dispose();

		String limit = loginPO.getLimit();

		switch (limit) {
		case "快递员":
			CourierFrame aCourier = new CourierFrame(loginPO);
			aCourier.setVisible(true);
			break;
		case "营业厅业务员":
			Business_hall_salesmanMainUI frame = new Business_hall_salesmanMainUI(loginPO);
			frame.setVisible(true);
			break;
		case "中转中心业务员":
			Transit_center_salesman_mainui tcs = new Transit_center_salesman_mainui(loginPO);
			tcs.setVisible(true);
			break;
		case "总经理":
			ManagerFrame mframe = new ManagerFrame(loginPO);
			mframe.setVisible(true);
			break;
		case "财务人员":
			FinanceFrame fs1 = new FinanceFrame(loginPO);
			break;
		case "高级财务人员":
			FinanceFrame fs2 = new FinanceFrame(loginPO);
			break;
		case "中转中心仓库管理员":
			Transit_center_storemaster_mainui ts = new Transit_center_storemaster_mainui(loginPO);
			ts.setVisible(true);
			break;
		case "系统管理员":
			Administratorframe ad = new Administratorframe(loginPO);
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
