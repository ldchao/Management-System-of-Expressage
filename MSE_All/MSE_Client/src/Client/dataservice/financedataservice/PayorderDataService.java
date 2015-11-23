package Client.dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Client.VO.PayeeorderVO;
import Client.VO.PayorderVO;
import PO.PayeeorderPO;
import PO.PayorderPO;

public interface PayorderDataService extends Remote{

	// 新建付款单
	public void insert(PayorderPO po)throws RemoteException;

	// 查看付款单时查找所有付款单信息
	public ArrayList<PayorderPO> find()throws RemoteException;

	// 查看成本收益（计算总支出、收入、利润）
	public double[] profit(ArrayList<PayorderPO> pay,
			ArrayList<PayeeorderPO> payee)throws RemoteException;

	// 导出截至当前日期的成本收益表
	public void excel(String date, double income, double outcome, double benefit)throws RemoteException;
}
