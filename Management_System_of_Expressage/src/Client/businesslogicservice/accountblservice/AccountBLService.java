package Client.businesslogicservice.accountblservice;

import java.util.ArrayList;

import Client.PO.AccountPO;
import Client.VO.AccountVO;

public interface AccountBLService {

	// �鿴�����˻�
	public ArrayList<AccountVO> check();

	// ����
	public void addAccount(String name, double money, String creator, String date,
			int state);

	// �޸��˻�
	public void updateAccount(AccountPO po, String name, double money, String creator,
			String date, int state);

	// �����˻������Ҳ�ɾ���˻�
	public void deleteAccount(String name);

	// ���ݹؼ��ֲ������п��ܵ��˻�
	public ArrayList<AccountVO> findAccount(String key);
}
