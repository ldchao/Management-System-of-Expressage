package nju.edu.businesslogicservice.financeblservice;

import java.util.ArrayList;

import nju.edu.VO.PayeeorderVO;
import nju.edu.VO.PayorderVO;

public interface StatisticsBLService {

	// 查看选定日期内所有的付款单和收款单信息
	public ArrayList<PayorderVO> checkPay(int start, int end);

	public ArrayList<PayeeorderVO> checkPayee(int start, int end);

	// 导出付款单和收款单信息
	public void excel(ArrayList<PayorderVO> payVo,
			ArrayList<PayeeorderVO> payeeVo);
}
