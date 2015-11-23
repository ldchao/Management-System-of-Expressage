package PO;

import java.io.Serializable;

import State.ApproveState;

public class AccountPO implements Serializable {
	private String name;
	private String money;
	private String date;
	private String creator;

	public AccountPO(String name, String money, String date, String creator) {
		super();
		this.name = name;
		this.money = money;
		this.date = date;
		this.creator = creator;
	}

	public String getName() {
		return this.name;
	}

	public String getMoney() {
		return this.money;
	}

	public String getDate() {
		return this.date;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

}
