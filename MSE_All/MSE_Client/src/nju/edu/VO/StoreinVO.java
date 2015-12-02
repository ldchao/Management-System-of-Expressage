package nju.edu.VO;

import java.io.Serializable;

import State.ApproveState;

public class StoreinVO implements Serializable{
	
	String order_number;
	String date;
	String offnum;
	String qu;
	String pai;
	String wei;
	String jia;

	public StoreinVO(String order_number, String date, String offnum,
			String qu, String pai, String wei, String jia) {
		super();
		this.order_number = order_number;
		this.date = date;
		this.offnum = offnum;
		this.qu = qu;
		this.pai = pai;
		this.wei = wei;
		this.jia = jia;
	}

	public String getOrder_number() {
		return order_number;
	}

	public String getDate() {
		return date;
	}

	public String getOffnum() {
		return offnum;
	}

	public String getQu() {
		return qu;
	}

	public String getPai() {
		return pai;
	}

	public String getWei() {
		return wei;
	}

	public String getJia() {
		return jia;
	}

}
