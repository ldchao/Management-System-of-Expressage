package nju.edu.dataservice.storedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.OrderPO;
import PO.StorePO;

public interface Inventory_managementDataService extends Remote{

	// �鿴ָ���ֿ�����λ�ÿ��״̬
	public StorePO check(int store_number) throws RemoteException;

	// ����ָ���ֿ�����λ�ÿ��״̬
	public void updata(StorePO sp, int store_number) throws RemoteException;

	// �鿴ָ���ֿ�ָ��ʱ����ڳ���������ͽ��
	public void checknumber(int store_number, String startdata, String overdata)
			throws RemoteException;

	// ���ļ��в���ָ����ĳ���������ͽ��
	public void addnumber(int store_number, String date, int storein_number,
			int storeout_number, int storein_money, int storeout_money)
			throws RemoteException;

	// �鿴ָ���ֿ�ָ��������ָ��ʱ��������ж�����Ϣ
	public void checkorder(int store_number, int store_qu, String startdata,
			String overdata) throws RemoteException;

	// ���ļ��в���һ�п����Ϣ�������Ϣ

	public void addorder(int store_number, OrderPO op) throws RemoteException;
}
