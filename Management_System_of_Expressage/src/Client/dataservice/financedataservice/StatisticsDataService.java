package Client.dataservice.financedataservice;

import java.util.ArrayList;

import Client.PO.PayeeorderPO;
import Client.PO.PayorderPO;

public interface StatisticsDataService {

	// 根据起始和结束日期查找选定日期内所有的付款单和收款单信息
	public ArrayList<PayorderPO> findPay(String start, String end);

	public ArrayList<PayeeorderPO> findPayee(String start, String end);

	// 导出付款单和收款单信息
	public void excel(ArrayList<PayorderPO> payVo,
			ArrayList<PayeeorderPO> payeeVo);
}
