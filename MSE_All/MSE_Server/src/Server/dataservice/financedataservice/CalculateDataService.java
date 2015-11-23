package Server.dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.PayeeorderPO;

public interface CalculateDataService extends Remote{
	
	// 按日期和营业厅查找收款信息
	public ArrayList<PayeeorderPO> find(String data,String shop)throws RemoteException;
	
	// 计算总收款金额
	public double total(double[] payee)throws RemoteException;
}
