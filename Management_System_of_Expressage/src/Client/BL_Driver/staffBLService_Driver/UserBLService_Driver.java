package Client.BL_Driver.staffBLService_Driver;

import Client.PO.UserPO;
import Client.businesslogicservice.staffblservice.UserBLService;

public class UserBLService_Driver {
	public void drive(UserBLService userBLService){
		String name="SURE",key="123456",limit="user";
		userBLService.addUser(name, key, limit);
		/*
		 * 判断用户是否存在  待完成
		 */
		userBLService.checkUser(name);
		/*
		 * 判断账是否存在 待完成
		 */
		userBLService.deleteUser(name);
		UserPO po = new UserPO();// ???
		userBLService.updateUser(po, name, key, limit);
	}
}
