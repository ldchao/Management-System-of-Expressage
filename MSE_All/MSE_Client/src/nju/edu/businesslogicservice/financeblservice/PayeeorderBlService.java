package nju.edu.businesslogicservice.financeblservice;

import java.util.ArrayList;

import PO.PayeeorderPO;

public interface PayeeorderBlService {

	// �½��տ
	public void addReceiForm(String order, String money, String date,
			String carrierName, String shopperName, boolean over);

	// ����ܽ��
	public double getTotal(ArrayList<PayeeorderPO> polist);

	// ������洢
	public void save(PayeeorderPO po);
}
