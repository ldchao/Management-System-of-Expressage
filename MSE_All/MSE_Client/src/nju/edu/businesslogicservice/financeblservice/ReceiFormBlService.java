package nju.edu.businesslogicservice.financeblservice;

import java.util.ArrayList;

import PO.PayeeorderPO;

public interface ReceiFormBlService {
	
	//新建收款单
	public void addReceiForm(String data, ArrayList<Integer> price, 
			ArrayList<String> orderNum,String carrierName, String recorder);
	
	//获得总金额
	public double getTotal(ArrayList<String> orderNum);
	
	//保存收款单数据
	public void endReceiForm();
	
	//导出excel
	public void exportPayeeorder(PayeeorderPO po);
}
