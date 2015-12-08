package PO;
import java.io.Serializable;
import java.util.ArrayList;

import State.ApproveState;
import State.ArriveState;

public class ReceiveorderPO implements Serializable{
	String date;  //到达日期1
	String departPlace;//出发地2
	String arrivePlace;//到达地3
	ArriveState arriveState;//到达状态4
	ArrayList<String> order;//所有单据5
	ApproveState approveState;//审批状态6

	public ReceiveorderPO(String date, String departPlace, String arrivePlace,
			ArriveState arriveState, ArrayList<String> order,ApproveState approveState) {
		super();
		this.date = date;
		this.departPlace = departPlace;
		this.arrivePlace = arrivePlace;
		this.arriveState = arriveState;
		this.order = order;
		this.approveState=approveState;
	}

	public String getDate() {
		return date;
	}

	public String getDepartPlace() {
		return departPlace;
	}

	public String getArrivePlace() {
		return arrivePlace;
	}

	public ArriveState getArriveState() {
		return arriveState;
	}

	public ArrayList<String> getOrder() {
		return order;
	}

	public ApproveState getApproveState(){
		return approveState;
	}

	public void setApproveState(ApproveState approveState) {
		this.approveState = approveState;
	}
	
}
