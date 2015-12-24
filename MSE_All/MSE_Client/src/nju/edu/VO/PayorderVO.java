package nju.edu.VO;

import java.io.Serializable;

import State.ApproveState;

@SuppressWarnings("serial")
public class PayorderVO implements Serializable {
	private String date;
	private double money;
	private String account;
	private String list;
	private String comment;
	private String payor;
	private ApproveState state;

	public PayorderVO(String date, double money, String account, String list,
			String comment, String payor) {
		super();
		this.date = date;
		this.money = money;
		this.account = account;
		this.list = list;
		this.comment = comment;
		this.payor = payor;
		this.state = ApproveState.Invalid;
	}
	
	public PayorderVO(String date, double money, String account, String list,
			String comment, String payor, ApproveState state) {
		super();
		this.date = date;
		this.money = money;
		this.account = account;
		this.list = list;
		this.comment = comment;
		this.payor = payor;
		this.state = state;
	}

	public ApproveState getState() {
		return this.state;
	}

	public void setState(ApproveState state) {
		this.state = state;
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
