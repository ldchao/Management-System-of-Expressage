package Server.dataservice.financedataservice;

import java.util.ArrayList;

import Client.VO.PayeeorderVO;
import Client.VO.PayorderVO;

public interface StatisticsDataService {

	// 根据起始和结束日期查找选定日期内所有的付款单和收款单信息
	public ArrayList<PayorderVO> findPay(String start, String end);

	public ArrayList<PayeeorderVO> findPayee(String start, String end);

	// 导出付款单和收款单信息
	public void excel(ArrayList<PayorderVO> payVo,
			ArrayList<PayeeorderVO> payeeVo);
}
