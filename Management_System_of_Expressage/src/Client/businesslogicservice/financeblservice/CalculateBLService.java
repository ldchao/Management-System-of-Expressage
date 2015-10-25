package Client.businesslogicservice.financeblservice;

import java.util.ArrayList;

import Client.PO.PayeeorderPO;

public interface CalculateBLService {
	
	// 按日期和营业厅查看收款信息
	public ArrayList<PayeeorderPO> check(String data,String shop);
	
	// 计算总收款金额
	public double total(double[] payee);
}
