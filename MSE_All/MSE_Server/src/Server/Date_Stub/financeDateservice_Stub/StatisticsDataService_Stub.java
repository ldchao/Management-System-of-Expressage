package Server.Date_Stub.financeDateservice_Stub;

import java.util.ArrayList;

import PO.PayeeorderPO;
import PO.PayorderPO;
import Server.dataservice.financedataservice.StatisticsDataService;

public class StatisticsDataService_Stub implements StatisticsDataService{

	@Override
	public ArrayList<PayorderPO> findPay(String start, String end) {
		// TODO Auto-generated method stub
		ArrayList<PayorderPO> payList = new ArrayList<PayorderPO>();
		payList.add(new PayorderPO());
		return payList;
	}

	@Override
	public ArrayList<PayeeorderPO> findPayee(String start, String end) {
		// TODO Auto-generated method stub
		ArrayList<PayeeorderPO> payeeList = new ArrayList<PayeeorderPO>();
		payeeList.add(new PayeeorderPO());
		return payeeList;
	}

	@Override
	public void excel(ArrayList<PayorderPO> payPo,
			ArrayList<PayeeorderPO> payeePo) {
		// TODO Auto-generated method stub
		System.out.println("Excel Succeed!");
	}

}
