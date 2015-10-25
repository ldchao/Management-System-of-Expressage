import java.io.Serializable;

public class PayorderPO implements Serializable {
	double payMoney;
	String payDate;
	String payName;
	String payAccount;
	String payList;
	String payComment;
	int payState;

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
