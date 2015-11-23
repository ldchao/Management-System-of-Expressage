<<<<<<< HEAD:MSE_All/MSE_Client/src/Client/BL_Stub/financeBLService_Stub/StatisticsBLService_Stub.java
package Client.BL_Stub.financeBLService_Stub;

import java.util.ArrayList;

import Client.VO.PayeeorderVO;
import Client.VO.PayorderVO;
import Client.businesslogicservice.financeblservice.StatisticsBLService;

public class StatisticsBLService_Stub implements StatisticsBLService{
	
	double payMoney; // 付款金额
	String payDate; // 付款日期
	String payName; // 付款人姓名
	String payAccount; // 付款账户
	String payList; // 条目
	String payComment; // 备注
	int payState; // 审批状态
	String date;
	String carrierName;
	String recorder;
	ArrayList<String> order;
	ArrayList<Integer> price;

	public StatisticsBLService_Stub(double payMoney, String payDate,
			String payName, String payAccount, String payList,
			String payComment, int payState, String date, String carrierName,
			String recorder, ArrayList<String> order, ArrayList<Integer> price) {
		super();
		this.payMoney = payMoney;
		this.payDate = payDate;
		this.payName = payName;
		this.payAccount = payAccount;
		this.payList = payList;
		this.payComment = payComment;
		this.payState = payState;
		this.date = date;
		this.carrierName = carrierName;
		this.recorder = recorder;
		this.order = order;
		this.price = price;
	}

	@Override
	public ArrayList<PayorderVO> checkPay(String start, String end) {
		// TODO Auto-generated method stub
		ArrayList<PayorderVO> payList = new ArrayList<PayorderVO>();
//		payList.add(new PayorderVO());
		return payList;
	}

	@Override
	public ArrayList<PayeeorderVO> checkPayee(String start, String end) {
		// TODO Auto-generated method stub
		ArrayList<PayeeorderVO> payeeList = new ArrayList<PayeeorderVO>();
		payeeList.add(new PayeeorderVO());
		return payeeList;
	}

	@Override
	public void excel(ArrayList<PayorderVO> payVo,
			ArrayList<PayeeorderVO> payeeVo) {
		// TODO Auto-generated method stub
		System.out.println("Excel Succeed!");
	}

	
}
=======
package Client.BL_Stub.financeBLService_Stub;

import java.util.ArrayList;

import Client.VO.PayeeorderVO;
import Client.VO.PayorderVO;
import Client.businesslogicservice.financeblservice.StatisticsBLService;

public class StatisticsBLService_Stub implements StatisticsBLService{
	
	double payMoney; // 付款金额
	String payDate; // 付款日期
	String payName; // 付款人姓名
	String payAccount; // 付款账户
	String payList; // 条目
	String payComment; // 备注
	int payState; // 审批状态
	String date;
	String carrierName;
	String recorder;
	ArrayList<String> order;
	ArrayList<Integer> price;

	public StatisticsBLService_Stub(double payMoney, String payDate,
			String payName, String payAccount, String payList,
			String payComment, int payState, String date, String carrierName,
			String recorder, ArrayList<String> order, ArrayList<Integer> price) {
		super();
		this.payMoney = payMoney;
		this.payDate = payDate;
		this.payName = payName;
		this.payAccount = payAccount;
		this.payList = payList;
		this.payComment = payComment;
		this.payState = payState;
		this.date = date;
		this.carrierName = carrierName;
		this.recorder = recorder;
		this.order = order;
		this.price = price;
	}

	@Override
	public ArrayList<PayorderVO> checkPay(String start, String end) {
		// TODO Auto-generated method stub
		ArrayList<PayorderVO> payList = new ArrayList<PayorderVO>();
//		payList.add(new PayorderVO());
		return payList;
	}

	@Override
	public ArrayList<PayeeorderVO> checkPayee(String start, String end) {
		// TODO Auto-generated method stub
		ArrayList<PayeeorderVO> payeeList = new ArrayList<PayeeorderVO>();
		payeeList.add(new PayeeorderVO());
		return payeeList;
	}

	@Override
	public void excel(ArrayList<PayorderVO> payVo,
			ArrayList<PayeeorderVO> payeeVo) {
		// TODO Auto-generated method stub
		System.out.println("Excel Succeed!");
	}

	
}
>>>>>>> origin/master:Management_System_of_Expressage/src/Client/BL_Stub/financeBLService_Stub/StatisticsBLService_Stub.java
