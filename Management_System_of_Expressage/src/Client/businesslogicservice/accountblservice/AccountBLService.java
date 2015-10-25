package Client.businesslogicservice.accountblservice;

import java.util.ArrayList;

import Client.PO.AccountPO;
import Client.VO.vo.AccountVO;

public interface AccountBLService {

	// �鿴�����˻�
	public ArrayList<AccountVO> check();

	// ����
	public void insert(String name, double money, String creator, String date,
			int state);

	// �޸��˻�
	public void update(AccountPO po, String name, double money, String creator,
			String date, int state);

	// �����˻������Ҳ�ɾ���˻�
	public void delete(String name);

	// ���ݹؼ��ֲ������п��ܵ��˻�
	public ArrayList<AccountVO> find(String key);
}
