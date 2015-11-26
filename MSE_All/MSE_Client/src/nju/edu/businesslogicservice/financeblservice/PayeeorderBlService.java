package nju.edu.businesslogicservice.financeblservice;

import java.util.ArrayList;

import PO.PayeeorderPO;

public interface PayeeorderBlService {

	// 新建收款单
	public void addReceiForm(String order, String money, String date,
			String carrierName, String shopperName, boolean over);

	// 获得总金额
	public double getTotal(ArrayList<PayeeorderPO> polist);

	// 审批后存储
	public void save(PayeeorderPO po);
}
