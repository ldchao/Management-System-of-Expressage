package nju.edu.businesslogicservice.accountblservice;

import java.util.ArrayList;

import nju.edu.VO.AccountVO;

public interface AccountBLService {

	// �鿴�����˻�
	public ArrayList<AccountVO> check();

	// ����
	public void addAccount(String name, String money, String creator,
			String date);

	// �޸��˻�
	public ArrayList<AccountVO> updateAccount(int pos,String name, String creator, String date);

	// �����˻������Ҳ�ɾ���˻�
	public void deleteAccount(String name);

	// ���ݹؼ��ֲ������п��ܵ��˻�
	public ArrayList<AccountVO> findAccount(String key);
}
