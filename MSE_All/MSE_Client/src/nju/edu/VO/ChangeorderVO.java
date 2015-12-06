package nju.edu.VO;

import java.io.Serializable;
import java.util.ArrayList;

public class ChangeorderVO implements Serializable{
	
	String date;  //装车日期
	String numberOfTransfer;  //本中转中心中转单编号
	String offnum;  //出发地
	String arrivenum;  //到达地
	String wayOfTransport;  //装运方式
	String monitor;  //监装员
	ArrayList<String> order_number;  //本次中转所有单号
	public ChangeorderVO(String numberOfTransfer,String date,  String offnum,
			String arrivenum, String wayOfTransport, String monitor,
			ArrayList<String> order_number) {
		super();
		this.date = date;
		this.numberOfTransfer = numberOfTransfer;
		this.offnum = offnum;
		this.arrivenum = arrivenum;
		this.wayOfTransport = wayOfTransport;
		this.monitor = monitor;
		this.order_number = order_number;
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
	
	
}
