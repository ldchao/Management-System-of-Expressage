package nju.edu.VO;

import java.io.Serializable;

public class ArriverorderVO implements Serializable{
	String numberOfTransferStation; //��ת���ı��  2
	String date;  //��������   1
	String offnum;  //������  3
	String arrive_state;  //���ﵽ��״̬  4

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
