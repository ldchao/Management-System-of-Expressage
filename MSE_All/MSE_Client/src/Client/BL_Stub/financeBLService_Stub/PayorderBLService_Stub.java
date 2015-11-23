<<<<<<< HEAD:MSE_All/MSE_Client/src/Client/BL_Stub/financeBLService_Stub/PayorderBLService_Stub.java
package Client.BL_Stub.financeBLService_Stub;

import java.util.ArrayList;

import Client.VO.PayeeorderVO;
import Client.VO.PayorderVO;
import Client.businesslogicservice.financeblservice.PayorderBLService;

public class PayorderBLService_Stub implements PayorderBLService{
	double payMoney; // 付款金额
	String payDate; // 付款日期
	String payName; // 付款人姓名
	String payAccount; // 付款账户
	String payList; // 条目
	String payComment; // 备注
	int payState; // 审批状态
	double[] total;
	
	public PayorderBLService_Stub(double payMoney, String payDate,
			String payName, String payAccount, String payList,
			String payComment, int payState) {
		super();
		this.payMoney = payMoney;
		this.payDate = payDate;
		this.payName = payName;
		this.payAccount = payAccount;
		this.payList = payList;
		this.payComment = payComment;
		this.payState = payState;
	}

	@Override
	public void addPayorder(double paymoney, String data, String payname,
			String payaccount, String list, String comment) {
		// TODO Auto-generated method stub
		System.out.println("Add Succeed!");
	}

	@Override
	public ArrayList<PayorderVO> checkPayorder() {
		// TODO Auto-generated method stub
		ArrayList<PayorderVO> payList = new ArrayList<PayorderVO>();
//		payList.add(new PayorderVO());
		return payList;
	}

	@Override
	public double[] profit(ArrayList<PayorderVO> pay,
			ArrayList<PayeeorderVO> payee) {
		// TODO Auto-generated method stub
		return total;
	}

	@Override
	public void excel(String date, double income, double outcome, double benefit) {
		// TODO Auto-generated method stub
		System.out.println("Excel Succeed!");
	}

	
}
=======
package Client.BL_Stub.financeBLService_Stub;

import java.util.ArrayList;

import Client.VO.PayeeorderVO;
import Client.VO.PayorderVO;
import Client.businesslogicservice.financeblservice.PayorderBLService;

public class PayorderBLService_Stub implements PayorderBLService{
	double payMoney; // 付款金额
	String payDate; // 付款日期
	String payName; // 付款人姓名
	String payAccount; // 付款账户
	String payList; // 条目
	String payComment; // 备注
	int payState; // 审批状态
	double[] total;
	
	public PayorderBLService_Stub(double payMoney, String payDate,
			String payName, String payAccount, String payList,
			String payComment, int payState) {
		super();
		this.payMoney = payMoney;
		this.payDate = payDate;
		this.payName = payName;
		this.payAccount = payAccount;
		this.payList = payList;
		this.payComment = payComment;
		this.payState = payState;
	}

	@Override
	public void addPayorder(double paymoney, String data, String payname,
			String payaccount, String list, String comment) {
		// TODO Auto-generated method stub
		System.out.println("Add Succeed!");
	}

	@Override
	public ArrayList<PayorderVO> checkPayorder() {
		// TODO Auto-generated method stub
		ArrayList<PayorderVO> payList = new ArrayList<PayorderVO>();
//		payList.add(new PayorderVO());
		return payList;
	}

	@Override
	public double[] profit(ArrayList<PayorderVO> pay,
			ArrayList<PayeeorderVO> payee) {
		// TODO Auto-generated method stub
		return total;
	}

	@Override
	public void excel(String date, double income, double outcome, double benefit) {
		// TODO Auto-generated method stub
		System.out.println("Excel Succeed!");
	}

	
}
>>>>>>> origin/master:Management_System_of_Expressage/src/Client/BL_Stub/financeBLService_Stub/PayorderBLService_Stub.java
