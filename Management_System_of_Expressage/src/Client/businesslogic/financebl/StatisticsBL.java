package Client.businesslogic.financebl;

import java.util.ArrayList;

import Client.VO.PayeeorderVO;
import Client.VO.PayorderVO;
import Client.businesslogicservice.financeblservice.StatisticsBLService;

public class StatisticsBL implements StatisticsBLService{

	@Override
	public ArrayList<PayorderVO> checkPay(String start, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<PayeeorderVO> checkPayee(String start, String end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excel(ArrayList<PayorderVO> payVo,
			ArrayList<PayeeorderVO> payeeVo) {
		// TODO Auto-generated method stub
		
	}

}
