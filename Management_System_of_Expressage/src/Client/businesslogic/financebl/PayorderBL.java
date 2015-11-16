package Client.businesslogic.financebl;

import java.util.ArrayList;

import Client.VO.PayorderVO;
import Client.businesslogicservice.financeblservice.PayorderBLService;

public class PayorderBL implements PayorderBLService{

	@Override
	public void addPayorder(double paymoney, String date, String payname,
			String payaccount, String list, String comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<PayorderVO> checkPayorder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double profit(double[] pay, double[] payee) {
		// TODO Auto-generated method stub
		double totalPay = 0;
		for(int i=0;i<pay.length;i++){
			totalPay += pay[i];
		}
		double totalPayee = 0;
		for(int j=0;j<payee.length;j++){
			totalPayee += payee[j];
		}
		return totalPay+totalPayee;
	}

	@Override
	public void excel(String date, double income, double outcome, double benefit) {
		// TODO Auto-generated method stub
		
	}

}
