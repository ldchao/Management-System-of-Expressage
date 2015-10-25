package Client.businesslogicservice.financeblservice;

import java.util.ArrayList;

import Client.VO.vo.PayeeorderVO;
import Client.VO.vo.PayorderVO;

public interface StatisticsBLService {

	// 查看选定日期内所有的付款单和收款单信息
	public ArrayList<PayorderVO> checkPay(String start, String end);

	public ArrayList<PayeeorderVO> checkPayee(String start, String end);

	// 导出付款单和收款单信息
	public void excel(ArrayList<PayorderVO> payVo,
			ArrayList<PayeeorderVO> payeeVo);
}
