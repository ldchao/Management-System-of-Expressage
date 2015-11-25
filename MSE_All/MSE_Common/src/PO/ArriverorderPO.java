package PO;
import java.io.Serializable;

import State.ApproveState;
import State.ArriveState;

//ArriverorderPO（到达单）类包含到达日期、中转单编号、出发地、货物到达状态、审批状态。

public class ArriverorderPO implements Serializable {

	String numberOfTransferStation; //中转中心编号  2
	String date;  //到达日期   1
	String offnum;  //出发地  3
	ArriveState arrive_state;  //货物到达状态  4
	ApproveState check_state;   //审批状态   5

	public ArriverorderPO(String numberOfTransferStation, String date,
			String offnum, ArriveState arrive_state, ApproveState check_state) {
		super();
		this.numberOfTransferStation = numberOfTransferStation;
		this.date = date;
		this.offnum = offnum;
		this.arrive_state = arrive_state;
		this.check_state = check_state;
	}

	public String getNumberOfTransferStation() {
		return numberOfTransferStation;
	}

	public void setNumberOfTransferStation(String numberOfTransferStation) {
		this.numberOfTransferStation = numberOfTransferStation;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getOffnum() {
		return offnum;
	}

	public void setOffnum(String offnum) {
		this.offnum = offnum;
	}

	public ArriveState getArrive_state() {
		return arrive_state;
	}

	public void setArrive_state(ArriveState arrive_state) {
		this.arrive_state = arrive_state;
	}

	public ApproveState getCheck_state() {
		return check_state;
	}

	public void setCheck_state(ApproveState check_state) {
		this.check_state = check_state;
	}

}
