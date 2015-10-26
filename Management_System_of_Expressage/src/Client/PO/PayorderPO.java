package Client.PO;

import java.io.Serializable;

public class PayorderPO implements Serializable {
	double payMoney; // 付款金额
	String payDate; // 付款日期
	String payName; // 付款人姓名
	String payAccount; // 付款账户
	String payList; // 条目
	String payComment; // 备注
	int payState; // 审批状态

	public PayorderPO(double money, String date, String name, String account,
			String list, String comment, int state) {
		payMoney = money;
		payDate = date;
		payName = name;
		payAccount = account;
		payList = list;
		payComment = comment;
		payState = state;
	}

	// 显示所有付款单时用
	public PayorderPO() {
		// TODO Auto-generated constructor stub
	}

	public double getPayMoney() {
		return payMoney;
	}

	public String getPayDate() {
		return payDate;
	}

	public String getPayName() {
		return payName;
	}

	public String getPayAccount() {
		return payAccount;
	}

	public String getPayList() {
		return payList;
	}

	public String getPayComment() {
		return payComment;
	}

	public int getPayState() {
		return payState;
	}

}
