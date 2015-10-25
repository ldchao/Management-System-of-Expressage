package Client.PO;
import java.io.Serializable;

//StoreoutorderPO（出库单）类包含快递编号、出库日期、目的地、装运形式、中转单编号/汽运编号、审核状态。
public class StoreoutorderPO implements Serializable {
	String order_number;
	String date;
	String arrivenum;
	String way;
	String numberOfTransport;
	int check_state;

	public StoreoutorderPO(String order_number, String date, String arrivenum,
			String way, String numberOfTransport, int check_state) {
		super();
		this.order_number = order_number;
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

	public void setDate(String date) {
		this.date = date;
	}

	public String getArrivenum() {
		return arrivenum;
	}

	public void setArrivenum(String arrivenum) {
		this.arrivenum = arrivenum;
	}

	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}

	public String getNumberOfTransport() {
		return numberOfTransport;
	}

	public void setNumberOfTransport(String numberOfTransport) {
		this.numberOfTransport = numberOfTransport;
	}

	public int getCheck_state() {
		return check_state;
	}

	public void setCheck_state(int check_state) {
		this.check_state = check_state;
	}

}
