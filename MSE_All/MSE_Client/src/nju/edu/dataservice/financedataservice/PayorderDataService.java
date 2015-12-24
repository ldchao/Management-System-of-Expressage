package nju.edu.dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.PayeeorderPO;
import PO.PayorderPO;

public interface PayorderDataService extends Remote {

	// 新建付款单
	public void insert(PayorderPO po) throws RemoteException;

	// 查看付款单时查找所有付款单信息
	public ArrayList<PayorderPO> find() throws RemoteException;

	// 查看未审批的付款单
	public ArrayList<PayorderPO> findUnchecked() throws RemoteException;

	// 查看成本收益（计算总支出、收入、利润）
	public double[] profit(ArrayList<PayorderPO> pay,
			ArrayList<PayeeorderPO> payee) throws RemoteException;

	// 删除已审批的
	public void delete(PayorderPO po) throws RemoteException;

}
