package Server.Date_Stub.financeDateservice_Stub;

import java.util.ArrayList;

import PO.PayeeorderPO;
import Server.dataservice.financedataservice.CalculateDataService;

public class CalculateDataService_Stub implements CalculateDataService{

	@Override
	public ArrayList<PayeeorderPO> find(String data, String shop) {
		// TODO Auto-generated method stub
		ArrayList<PayeeorderPO> payeeList = new ArrayList<PayeeorderPO>();
		payeeList.add(new PayeeorderPO());  //าษฮสฃก
		return payeeList;
	}

	@Override
	public double total(double[] payee) {
		// TODO Auto-generated method stub
		double total = 0;
		return total;
	}

}
