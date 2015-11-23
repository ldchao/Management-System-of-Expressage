package Server.Date_Stub.financeDateservice_Stub;

import java.util.ArrayList;

import PO.PayeeorderPO;
import PO.PayorderPO;
import Server.dataservice.financedataservice.PayorderDataService;

public class PayorderDataService_Stub implements PayorderDataService{
	
	@Override
	public void insert(PayorderPO po) {
		// TODO Auto-generated method stub
		System.out.println("Insert Succeed!");
	}

	@Override
	public ArrayList<PayorderPO> find() {
		// TODO Auto-generated method stub
		ArrayList<PayorderPO> payList = new ArrayList<PayorderPO>();
	//	payList.add(new PayorderPO()); //“…Œ £°
		return payList;
	}

	@Override
	public void excel(String date, double income, double outcome, double benefit) {
		// TODO Auto-generated method stub
		System.out.println("Excel Succeed!");
	}

	@Override
	public double[] profit(ArrayList<PayorderPO> pay,
			ArrayList<PayeeorderPO> payee) {
		// TODO Auto-generated method stub
		return null;
	}


}
