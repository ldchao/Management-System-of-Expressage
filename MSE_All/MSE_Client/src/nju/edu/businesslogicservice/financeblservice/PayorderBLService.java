package nju.edu.businesslogicservice.financeblservice;

import java.util.ArrayList;

import nju.edu.VO.PayeeorderVO;
import nju.edu.VO.PayorderVO;

public interface PayorderBLService {

	// 新建付款单
	public void addPayorder(double paymoney, String date, String payname,
			String payaccount, String list, String comment);

	// 查看付款单时显示所有付款单信息
	public ArrayList<PayorderVO> checkPayorder();

	// 查看成本收益（计算总支出、收入、利润）
	public double[] profit(ArrayList<PayorderVO> pay,
			ArrayList<PayeeorderVO> payee);

	// 导出截至当前日期的成本收益表
	public void excel(String date, double income, double outcome, double benefit);
}