package PO;
import java.io.Serializable;

import State.ApproveState;

//StoreoutorderPO（出库单）类包含快递编号、出库日期、目的地、装运形式、中转单编号、审核状态。
public class StoreoutorderPO implements Serializable {
	String order_number;  //快递编号  1
	String date;   //出库日期  2
	String arrivenum;   //目的地  3
	String way;   //装运形式  4
	String numberOfTransport;  //中转单编号  5
	ApproveState check_state;   //审核状态   6

	public StoreoutorderPO( String date, String arrivenum,
			String way, String numberOfTransport, ApproveState check_state) {
		super();
		this.date = date;
		this.arrivenum = arrivenum;
		this.way = way;
		this.numberOfTransport = numberOfTransport;
		this.check_state = check_state;
	}

	public String getOrder_number() {
		return order_number;
	}

	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}

	public String getDate() {
		return date;
	}

	public String getArrivenum() {
		return arrivenum;
	}

	public String getWay() {
		return way;
	}

	public String getNumberOfTransport() {
		return numberOfTransport;
	}


	public ApproveState getCheck_state() {
		return check_state;
	}


}
