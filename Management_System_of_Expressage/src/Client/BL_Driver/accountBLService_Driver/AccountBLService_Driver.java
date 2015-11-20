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
		 * 判断账户是否存在 待完成
		 */
		accountBLService.deleteAccount(name);
		/*
		 * 判断账户是否存在 待完成
		 */
		accountBLService.findAccount(key);
		/*
		 * 判断可能的账户是否存在 待完成
		 */
		accountBLService.updateAccount(0,name, creator, date, state);

	}

}
