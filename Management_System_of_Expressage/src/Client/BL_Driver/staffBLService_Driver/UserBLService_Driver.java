package Client.BL_Driver.staffBLService_Driver;

import Client.PO.UserPO;
import Client.businesslogicservice.staffblservice.UserBLService;

public class UserBLService_Driver {
	public void drive(UserBLService userBLService){
		String name="SURE",key="123456",limit="user";
		userBLService.addUser(name, key, limit);
		/*
		 * �ж��û��Ƿ����  �����
		 */
		userBLService.checkUser(name);
		/*
		 * �ж����Ƿ���� �����
		 */
		userBLService.deleteUser(name);
		userBLService.updateUser(0, name, limit);
	}
}
