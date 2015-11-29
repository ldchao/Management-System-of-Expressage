package nju.edu.dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.PayeeorderPO;
import PO.PayorderPO;

public interface StatisticsDataService extends Remote {

	// 根据起始和结束日期查找选定日期内所有的付款单和收款单信息
	public ArrayList<PayorderPO> findPay(String start, String end)
			throws RemoteException;

	public ArrayList<PayeeorderPO> findPayee(String start, String end)
			throws RemoteException;

	// 导出付款单和收款单信息
	public void excel(ArrayList<PayorderPO> payVo,
			ArrayList<PayeeorderPO> payeeVo, String date)
			throws RemoteException;
}
