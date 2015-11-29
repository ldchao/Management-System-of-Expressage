package PO;
import java.io.Serializable;
import java.util.ArrayList;

import State.ApproveState;
import State.ArriveState;

public class ReceiveorderPO implements Serializable{
	String date;
	String departPlace;
	String arrivePlace;
	ArriveState arriveState;
	ArrayList<String> order;
	ApproveState approveState;

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
	
}
