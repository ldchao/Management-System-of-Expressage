package Client.dataservice.financedataservice;

import java.util.ArrayList;

import Client.PO.PayeeorderPO;

public interface CalculateDataService {
	
	// 按日期和营业厅查找收款信息
	public ArrayList<PayeeorderPO> find(String data,String shop);
	
	// 计算总收款金额
	public double total(double[] payee);
}
