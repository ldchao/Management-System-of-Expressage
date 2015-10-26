package Server.Date_Stub.financeDateservice_Stub;

import java.util.ArrayList;

import Client.PO.PayorderPO;
import Client.VO.PayorderVO;
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
		payList.add(new PayorderPO()); //���ʣ�
		return payList;
	}

	@Override
	public double profit(double[] pay, double[] payee) {
		// TODO Auto-generated method stub
		double total = 0;
		return total;
	}

	@Override
	public void excel(String date, double income, double outcome, double benefit) {
		// TODO Auto-generated method stub
		System.out.println("Excel Succeed!");
	}


}