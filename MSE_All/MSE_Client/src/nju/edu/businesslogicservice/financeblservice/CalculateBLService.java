package nju.edu.businesslogicservice.financeblservice;

import java.util.ArrayList;

import nju.edu.VO.PayeeorderVO;

public interface CalculateBLService {
	
	// 按日期和营业厅查看收款信息
	public ArrayList<PayeeorderVO> check(String data,String shop);
	
	// 计算总收款金额
	public double total(double[] payee);
}
