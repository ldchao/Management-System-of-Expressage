<<<<<<< HEAD:MSE_All/MSE_Client/src/Client/businesslogicservice/accountblservice/AccountBLService.java
package Client.businesslogicservice.accountblservice;

import java.util.ArrayList;

import Client.VO.AccountVO;

public interface AccountBLService {

	// �鿴�����˻�
	public ArrayList<AccountVO> check();

	// ����
	public void addAccount(String name, double money, String creator,
			String date, int state);

	// �޸��˻�
	public ArrayList<AccountVO> updateAccount(int pos,String name, String creator, String date,
			int state);

	// �����˻������Ҳ�ɾ���˻�
	public void deleteAccount(String name);

	// ���ݹؼ��ֲ������п��ܵ��˻�
	public ArrayList<AccountVO> findAccount(String key);
}
=======
package Client.businesslogicservice.accountblservice;

import java.util.ArrayList;

import Client.PO.AccountPO;
import Client.VO.AccountVO;

public interface AccountBLService {

	// �鿴�����˻�
	public ArrayList<AccountVO> check();

	// ����
	public void addAccount(String name, double money, String creator,
			String date, int state);

	// �޸��˻�
	public ArrayList<AccountVO> updateAccount(int pos,String name, String creator, String date,
			int state);

	// �����˻������Ҳ�ɾ���˻�
	public void deleteAccount(String name);

	// ���ݹؼ��ֲ������п��ܵ��˻�
	public ArrayList<AccountVO> findAccount(String key);
}
>>>>>>> origin/master:Management_System_of_Expressage/src/Client/businesslogicservice/accountblservice/AccountBLService.java
