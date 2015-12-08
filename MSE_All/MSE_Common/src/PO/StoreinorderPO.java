package PO;

import java.io.Serializable;

import State.ApproveState;

//StoreinorderPO（入库单）类包含快递编号、入库日期、目的地、区号、排号、架号、位号、审批状态。
public class StoreinorderPO implements Serializable {

	String order_number; // 快递编号 1
	String date; // 入库日期 2
	String offnum; // 目的地 3
	String qu; // 区号 4
	String pai; // 排号 5
	String jia; // 架号 6
	String wei; // 位号 7
	ApproveState check_state; // 审批状态 8

	public StoreinorderPO(String order_number, String date, String offnum,
			String qu, String pai, String jia, String wei,
			ApproveState check_state) {
		super();
		this.order_number = order_number;
		this.date = date;
		this.offnum = offnum;
		this.qu = qu;
		this.pai = pai;
		this.jia = jia;
		this.wei = wei;		
		this.check_state = check_state;
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

	public ApproveState getCheck_state() {
		return check_state;
	}

	public void setCheck_state(ApproveState check_state) {
		this.check_state = check_state;
	}

	
}
