package Client.BL_Driver.financeBLService_Driver;

import java.util.ArrayList;

import Client.VO.PayeeorderVO;
import Client.VO.PayorderVO;
import Client.businesslogicservice.financeblservice.StatisticsBLService;

public class StatisticsBLService_Driver {
	public void drive(StatisticsBLService statisticsBLService){
		statisticsBLService.checkPay("2015-10-20", "2015-10-26");
		statisticsBLService.checkPayee("2015-10-20", "2015-10-26");

		ArrayList<PayorderVO> payVo = new ArrayList<>(); 
		ArrayList<PayeeorderVO> payeeVo = new ArrayList<>();
		statisticsBLService.excel(payVo, payeeVo);
	}
}
