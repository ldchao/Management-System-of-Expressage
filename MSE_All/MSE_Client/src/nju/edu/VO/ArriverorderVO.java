package nju.edu.VO;

import java.io.Serializable;

public class ArriverorderVO implements Serializable{
	String numberOfTransferStation; //中转中心编号  2
	String date;  //到达日期   1
	String offnum;  //出发地  3
	String arrive_state;  //货物到达状态  4

	public ArriverorderVO(String numberOfTransferStation, String date,
			String offnum,String arrive_state) {
		super();
		this.numberOfTransferStation = numberOfTransferStation;
		this.date = date;
		this.offnum = offnum;
		this.arrive_state = arrive_state;
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
}
