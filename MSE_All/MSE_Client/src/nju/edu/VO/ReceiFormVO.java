package nju.edu.VO;

import java.io.Serializable;
import java.util.ArrayList;

import State.ApproveState;
import State.ArriveState;

public class ReceiFormVO implements Serializable {

	String data; //到达日期
	String departPlace;  //出发地
	String arriveState;  //到达地
	String arrive_state;  //货物到达状态  4
	
	String carNum;  //通过装运单编号前四位得到交通工具代号
	String monitorName;  //监装员姓名
	String transferName;  //押运员姓名 
	ArrayList<String> order;  //所有订单编号
	
	public ReceiFormVO(String data,  String departPlace,
			String arriveState,String arrive_state, String carNum, String monitorName,
			String transferName, ArrayList<String> order) {
		super();
		this.data = data;
		this.departPlace = departPlace;
		this.arriveState = arriveState;
		this.arrive_state = arrive_state;
		this.carNum = carNum;
		this.monitorName = monitorName;
		this.transferName = transferName;
		this.order = order;
	}

	public String getData() {
		return data;
	}

	public String getDepartPlace() {
		return departPlace;
	}

	public String getArriveState() {
		return arriveState;
	}

	public String getArrive_state() {
		return arrive_state;
	}	
	
	public String getCarNum() {
		return carNum;
	}

	public String getMonitorName() {
		return monitorName;
	}

	public String getTransferName() {
		return transferName;
	}

	
	public ArrayList<String> getOrderNum() {
		return order;
	} 
	
	
}
