package Server.Date_Stub.storeDateservice_Stub;

import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.OrderPO;
import PO.StorePO;
import Server.dataservice.storedataservice.Inventory_managementDataService;

public class Inventory_managementDataService_Stub implements Inventory_managementDataService{

	// �鿴ָ���ֿ�����λ�ÿ��״̬
	@Override
	public StorePO check(int store_number) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("�½��ɹ�");
		int[][][][] store=new int[4][5][20][20];
		StorePO po=new StorePO(0,0,store);
		return po;
	}

	// ����ָ���ֿ�����λ�ÿ��״̬
	@Override
	public void updata(StorePO sp, int store_number) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("���¿��ɹ�");
		
	}

	// �鿴ָ���ֿ�ָ��ʱ����ڳ���������ͽ��
	@Override
	public String checknumber(int store_number, String startdata, String overdata)
			throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("��ѯ����������ͽ��");
		String number=new String();
		return number;
	}

	// ���ļ��в���ָ����ĳ���������ͽ��
	@Override
	public void addnumber(int store_number, String date, int storein_number,
			int storeout_number, int storein_money, int storeout_money)
			throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("�½��ɹ�");
		
	}

	// �鿴ָ���ֿ�ָ��������ָ��ʱ��������ж�����Ϣ
	@Override
	public ArrayList<String> checkorder(int store_number, int store_qu, String startdata,
			String overdata) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("��ѯ������Ϣ");
		ArrayList<String> orderlist=new ArrayList<String>();
		return orderlist;
	}

	// ���ļ��в���һ�п����Ϣ�������Ϣ
	@Override
	public void addorder(int store_number, OrderPO op) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("�½��ɹ�");
		
	}

	
}
