package Server.dataservice.storedataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import Client.PO.OrderPO;
import Client.PO.StorePO;

public interface Inventory_managementDataService {

	// �鿴ָ���ֿ�����λ�ÿ��״̬
	public StorePO check(int store_number) throws RemoteException;

	// ����ָ���ֿ�����λ�ÿ��״̬
	public void updata(StorePO sp, int store_number) throws RemoteException;

	// �鿴ָ���ֿ�ָ��ʱ����ڳ���������ͽ��
	public String checknumber(int store_number, String startdata, String overdata)
			throws RemoteException;

	// ���ļ��в���ָ����ĳ���������ͽ��
	public void addnumber(int store_number, String date, int storein_number,
			int storeout_number, int storein_money, int storeout_money)
			throws RemoteException;

	// �鿴ָ���ֿ�ָ��������ָ��ʱ��������ж�����Ϣ
	public ArrayList<String> checkorder(int store_number, int store_qu, String startdata,
			String overdata) throws RemoteException;

	// ���ļ��в���һ�п����Ϣ�������Ϣ

	public void addorder(int store_number, OrderPO op) throws RemoteException;
}
