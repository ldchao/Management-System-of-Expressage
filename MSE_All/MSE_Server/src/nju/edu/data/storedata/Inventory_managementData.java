package nju.edu.data.storedata;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import nju.edu.dataservice.storedataservice.Inventory_managementDataService;
import PO.OrderPO;
import PO.StorePO;

public class Inventory_managementData extends UnicastRemoteObject implements Inventory_managementDataService{

	public Inventory_managementData() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	// �鿴ָ���ֿ�����λ�ÿ��״̬
	@Override
	public StorePO check(int store_number) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	// ����ָ���ֿ�����λ�ÿ��״̬
	@Override
	public void updata(StorePO sp, int store_number) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	// �鿴ָ���ֿ�ָ��ʱ����ڳ���������ͽ��
	@Override
	public String checknumber(int store_number, String startdata,
			String overdata) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	// ���ļ��в���ָ����ĳ���������ͽ��
	@Override
	public void addnumber(int store_number, String date, int storein_number,
			int storeout_number, int storein_money, int storeout_money)
			throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	// �鿴ָ���ֿ�ָ��������ָ��ʱ��������ж�����Ϣ
	@Override
	public ArrayList<String> checkorder(int store_number, int store_qu,
			String startdata, String overdata) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	// ���ļ��в���һ�п����Ϣ�������Ϣ
	@Override
	public void addorder(int store_number, OrderPO op) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
