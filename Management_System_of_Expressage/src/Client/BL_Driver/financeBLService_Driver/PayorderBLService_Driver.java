package Client.BL_Driver.financeBLService_Driver;

import Client.businesslogicservice.financeblservice.PayorderBLService;

public class PayorderBLService_Driver {
	public void drive(PayorderBLService payorderBLService){
		double paymoney = 100;
		String date="2015-10-26",payname="SURE",payaccount="SURE",list="none",comment="none";
		double[] pay = {10.0,100,200.5};
		double[] payee = {5.5,6.5,7.5};
		double income = pay[0]+pay[1]+pay[2];
		double outcome = payee[0]+payee[1]+payee[2];
		double benefit = income - outcome;
		
		payorderBLService.addPayorder(paymoney, date, payname, payaccount, list, comment);
		payorderBLService.checkPayorder();
//		payorderBLService.profit(pay, payee);
		payorderBLService.excel(date, income, outcome, benefit);
	}
}
