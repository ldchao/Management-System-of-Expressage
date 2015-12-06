package nju.edu.VO;

import java.io.Serializable;
import java.util.ArrayList;

import State.ApproveState;

public class VehicleLoadorderVO implements Serializable {
	String date;    //装运日期  2
	String loadorderNum;  //装运单编号   1
	String transferNum;     //中转中心编号或营业厅编号  3
	String arriveNum;      //到达地编号 4
	String monitorName;   //监装员姓名 5
	String transferName;   //押运员姓名 6
	String transportNum;   //运输编号（汽运编号，铁运编号，航运编号）  7
	String order; //所有订单编号   8
	ArrayList<String> orderlist;
	String fee;   //运费  9 
	String changeorderNum;

	public VehicleLoadorderVO(String date,String loadorderNum,String transferNum,String arriveNum,
			String monitorName,String transferName,String transportNum,String order,String fee){
		super();
		this.date = date;
		this.loadorderNum = loadorderNum;
		this.transferNum = transferNum;
		this.arriveNum = arriveNum;
		this.monitorName = monitorName;
		this.transferName = transferName;
		this.transportNum = transportNum;
		this.order = order;
		this.fee = fee;
	}
	public VehicleLoadorderVO(String date,String loadorderNum,String transferNum,String arriveNum,
			String monitorName,String transferName,String transportNum,ArrayList<String> orderlist,String fee,String changeorderNum){
		super();
		this.date = date;
		this.loadorderNum = loadorderNum;
		this.transferNum = transferNum;
		this.arriveNum = arriveNum;
		this.monitorName = monitorName;
		this.transferName = transferName;
		this.transportNum = transportNum;
		this.orderlist = orderlist;
		this.fee = fee;
		this.changeorderNum=changeorderNum;
	}
	
	public String getChangeorderNum() {
		return changeorderNum;
	}
	public ArrayList<String> getOrderlist() {
		return orderlist;
	}
	public String getDate(){
		return date;
	}

	public String getLoadorderNum(){
		return loadorderNum;
	}

	public String getTransferNum(){
		return transferNum;
	}

	public String getArriveNum(){
		return arriveNum;
	}

	public String getMonitorName(){
		return monitorName;
	}

	public String getTransferName(){
		return transferName;
	}

	public String getTransportNum(){
		return transportNum;
	}

	public String getOrder(){
		return order;
	}

	public String getFee(){
		return fee;
	}

}
