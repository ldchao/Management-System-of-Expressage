package Client.BL_Stub.financeBLService_Stub;

import java.util.ArrayList;

import Client.VO.PayeeorderVO;
import Client.businesslogicservice.financeblservice.CalculateBLService;

public class CalculateBLService_Stub implements CalculateBLService{
	
	String data;
	String shop;
	double total;
	String date;
	String carrierName;
	String recorder;

	public CalculateBLService_Stub(String data, String shop, double total,
			String date, String carrierName, String recorder) {
		super();
		this.data = data;
		this.shop = shop;
		this.total = total;
		this.date = date;
		this.carrierName = carrierName;
		this.recorder = recorder;
	}

	@Override
	public ArrayList<PayeeorderVO> check(String data, String shop) {
		// TODO Auto-generated method stub
		ArrayList<PayeeorderVO> payeeList = new ArrayList<PayeeorderVO>();
		payeeList.add(new PayeeorderVO());
		return payeeList;
	}

	@Override
	public double total(double[] payee) {
		// TODO Auto-generated method stub
		return total;
	}
	

}
