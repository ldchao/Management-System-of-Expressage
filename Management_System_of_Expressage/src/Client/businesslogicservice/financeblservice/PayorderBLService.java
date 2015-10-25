package Client.businesslogicservice.financeblservice;

import java.util.ArrayList;

import Client.PO.PayorderPO;
import Client.VO.PayorderVO;

public interface PayorderBLService {

	// 新建付款单
	public void insert(double paymoney, String data, String payname,
			String payaccount, String list, String comment);

	// 查看付款单时显示所有付款单信息
	public ArrayList<PayorderVO> check();

	// 查看成本收益（计算总支出、收入、利润）
	public double profit(double[] pay, double[] payee);

	// 导出截至当前日期的成本收益表
	public void excel(String date, double income, double outcome, double benefit);
}
