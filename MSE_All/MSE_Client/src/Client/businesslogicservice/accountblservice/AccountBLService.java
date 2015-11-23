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
