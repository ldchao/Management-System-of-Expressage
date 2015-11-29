package nju.edu.dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.PayeeorderPO;
import PO.PayorderPO;

public interface StatisticsDataService extends Remote {

	// ������ʼ�ͽ������ڲ���ѡ�����������еĸ�����տ��Ϣ
	public ArrayList<PayorderPO> findPay(String start, String end)
			throws RemoteException;

	public ArrayList<PayeeorderPO> findPayee(String start, String end)
			throws RemoteException;

	// ����������տ��Ϣ
	public void excel(ArrayList<PayorderPO> payVo,
			ArrayList<PayeeorderPO> payeeVo, String date)
			throws RemoteException;
}
