package Client.dataservice.accountdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.AccountPO;

public interface AccountDataService extends Remote {

	// �����˻�
	public void insert(AccountPO po) throws RemoteException;

	// �޸��˻�
	public ArrayList<AccountPO> update(AccountPO po, int pos)
			throws RemoteException;

	// �����˻������Ҳ�ɾ���˻�
	public void delete(String name) throws RemoteException;

	// �鿴�����˻�
	public ArrayList<AccountPO> check() throws RemoteException;

	// ���ݹؼ��ֲ������п��ܵ��˻�
	public ArrayList<AccountPO> find(String key) throws RemoteException;
}
