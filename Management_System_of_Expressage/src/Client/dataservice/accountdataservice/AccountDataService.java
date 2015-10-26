package Client.dataservice.accountdataservice;

import java.util.ArrayList;

import Client.PO.AccountPO;

public interface AccountDataService {

	// �����˻�
	public void insert(AccountPO po);

	// �޸��˻�
	public void update(AccountPO po);

	// �����˻������Ҳ�ɾ���˻�
	public void delete(String name);

	// ���ݹؼ��ֲ������п��ܵ��˻�
	public ArrayList<AccountPO> find(String key);
}
