<<<<<<< HEAD:MSE_All/MSE_Client/src/Client/businesslogicservice/staffblservice/UserBLService.java
package Client.businesslogicservice.staffblservice;

import java.util.ArrayList;

import Client.VO.UserVO;

public interface UserBLService {

	// �½��û�
	public void addUser(String name, String key, String limit);

	// �޸��û�
	public ArrayList<UserVO> updateUser(int pos, String name, String limit);

	// ɾ���û�
	public void deleteUser(String name);

	// �鿴һ���û�
	public UserVO checkUser(String name);

	// �鿴�����û�
	public ArrayList<UserVO> checkUsers();

}
=======
package Client.businesslogicservice.staffblservice;

import java.util.ArrayList;

import Client.PO.UserPO;
import Client.VO.UserVO;

public interface UserBLService {

	// �½��û�
	public void addUser(String name, String key, String limit);

	// �޸��û�
	public ArrayList<UserVO> updateUser(int pos, String name, String limit);

	// ɾ���û�
	public void deleteUser(String name);

	// �鿴һ���û�
	public UserVO checkUser(String name);

	// �鿴�����û�
	public ArrayList<UserVO> checkUsers();

}
>>>>>>> origin/master:Management_System_of_Expressage/src/Client/businesslogicservice/staffblservice/UserBLService.java
