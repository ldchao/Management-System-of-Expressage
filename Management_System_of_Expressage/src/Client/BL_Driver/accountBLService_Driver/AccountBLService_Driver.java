package Client.BL_Driver.accountBLService_Driver;

import Client.PO.AccountPO;
import Client.businesslogicservice.accountblservice.AccountBLService;

public class AccountBLService_Driver {
	public void drive(AccountBLService accountBLService) {
		accountBLService.check();

		String name = "SURE", creator = "SURE", date = "2015-10-25";
		String key = "SURE";
		int state = 1;
		double money = 1000.0;
		accountBLService.addAccount(name, money, creator, date, state);
		/*
		 * �ж��˻��Ƿ���� �����
		 */
		accountBLService.deleteAccount(name);
		/*
		 * �ж��˻��Ƿ���� �����
		 */
		accountBLService.findAccount(key);
		/*
		 * �жϿ��ܵ��˻��Ƿ���� �����
		 */
		accountBLService.updateAccount(0,name, creator, date, state);

	}

}
