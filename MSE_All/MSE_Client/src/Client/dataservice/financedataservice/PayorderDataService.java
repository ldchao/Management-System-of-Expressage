package Client.dataservice.financedataservice;

import java.util.ArrayList;

import PO.PayorderPO;

public interface PayorderDataService {

	// 新建付款单
	public void insert(PayorderPO po);

	// 查看付款单时查找所有付款单信息
	public ArrayList<PayorderPO> find();

	// 查看成本收益（计算总支出、收入、利润）
	public double profit(double[] pay, double[] payee);

	// 导出截至当前日期的成本收益表
	public void excel(String date, double income, double outcome, double benefit);
}
