package PO;

import java.io.Serializable;

public class PayorderPO implements Serializable {
	private String date;
	private double money;
	private String account;
	private String list;
	private String comment;
	private String payor;
	
	public PayorderPO(String date, double money, String account, String list,
			String comment, String payor) {
		super();
		this.date = date;
		this.money = money;
		this.account = account;
		this.list = list;
		this.comment = comment;
		this.payor = payor;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getList() {
		return list;
	}

	public void setList(String list) {
		this.list = list;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getPayor() {
		return payor;
	}

	public void setPayor(String payor) {
		this.payor = payor;
	}
}
