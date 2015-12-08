package PO;

import java.io.Serializable;
import java.util.ArrayList;

import State.ApproveState;

//ChangeorderPO（中转单）类包含装车日期、本中转中心中转单编号、出发地、到达地、装运方式、监装员、本次中转所有单号、审批状态
public class ChangeorderPO implements Serializable {

	String date; // 装车日期 2
	String numberOfTransfer; // 本中转中心中转单编号 1
	String offnum; // 出发地 3
	String arrivenum; // 到达地 4
	String wayOfTransport; // 装运方式 5
	String monitor; // 监装员 6
	ArrayList<String> order_number; // 本次中转所有单号 7
	ApproveState check_state; // 审批状态 8

	public ChangeorderPO(String date, String numberOfTransfer, String offnum,
			String arrivenum, String wayOfTransport, String monitor,
			ArrayList<String> order_number, ApproveState check_state) {
		super();
		this.date = date;
		this.numberOfTransfer = numberOfTransfer;
		this.offnum = offnum;
		this.arrivenum = arrivenum;
		this.wayOfTransport = wayOfTransport;
		this.monitor = monitor;
		this.order_number = order_number;
		this.check_state = check_state;
	}

	public String getDate() {
		return date;
	}

	public String getNumberOfTransfer() {
		return numberOfTransfer;
	}

	public String getOffnum() {
		return offnum;
	}

	public String getArrivenum() {
		return arrivenum;
	}

	public String getWayOfTransport() {
		return wayOfTransport;
	}

	public String getMonitor() {
		return monitor;
	}

	public ArrayList<String> getOrder_number() {
		return order_number;
	}

	public ApproveState getCheck_state() {
		return check_state;
	}

	public void setCheck_state(ApproveState check_state) {
		this.check_state = check_state;
	}
}
