package nju.edu.VO;

import java.io.Serializable;
import java.util.ArrayList;

public class ArriverorderVO implements Serializable{
	String numberOfTransferStation; //中转中心编号  2
	String date;  //到达日期   1
	String offnum;  //出发地  3
	String arrive_state;  //货物到达状态  4
	
	String carNum;  //通过装运单编号前四位得到交通工具代号
	String monitorName;  //监装员姓名
	String transferName;  //押运员姓名 
	ArrayList<String> order;  //所有订单编号

	public ArriverorderVO(String numberOfTransferStation, String date,
			String offnum,String arrive_state, String carNum, String monitorName,
			String transferName, ArrayList<String> order) {
		super();
		this.numberOfTransferStation = numberOfTransferStation;
		this.date = date;
		this.offnum = offnum;
		this.arrive_state = arrive_state;
		this.carNum = carNum;
		this.monitorName = monitorName;
		this.transferName = transferName;
		this.order = order;
	}

	public String getNumberOfTransferStation() {
		return numberOfTransferStation;
	}

	public String getDate() {
		return date;
	}

	public String getOffnum() {
		return offnum;
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

	public ArrayList<String> getOrder() {
		return order;
	}

}
