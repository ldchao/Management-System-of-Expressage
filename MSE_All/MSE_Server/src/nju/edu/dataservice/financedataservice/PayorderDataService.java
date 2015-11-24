package nju.edu.dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.PayeeorderPO;
import PO.PayorderPO;

public interface PayorderDataService extends Remote {

	// �½����
	public void insert(PayorderPO po)throws RemoteException;

	// �鿴���ʱ�������и����Ϣ
	public ArrayList<PayorderPO> find()throws RemoteException;

	// �鿴�ɱ����棨������֧�������롢����
	public double[] profit(ArrayList<PayorderPO> pay,
			ArrayList<PayeeorderPO> payee)throws RemoteException;

	// ����������ǰ���ڵĳɱ������
	public void excel(String date, double income, double outcome, double benefit)throws RemoteException;
}