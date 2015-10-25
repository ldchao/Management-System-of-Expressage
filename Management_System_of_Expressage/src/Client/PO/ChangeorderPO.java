import java.io.Serializable;
import java.util.ArrayList;

//ChangeorderPO（中转单）类包含装车日期、本中转中心中转单编号、航班号、出发地、到达地、监装员、本次中转所有单号、审批状态
public class ChangeorderPO implements Serializable {

	int ways;
	String date;
	String numberOfTransfer;
	String numberOfTransport;
	String offnum;
	String arrivenum;
	String monitor;
	ArrayList<String> order_number;
	int check_state;

	public ChangeorderPO(int ways, String date, String numberOfTransfer,
			String numberOfTransport, String offnum, String arrivenum,
			String monitor, ArrayList<String> order_number, int check_state) {
		super();
		this.ways = ways;
		this.date = date;
		this.numberOfTransfer = numberOfTransfer;
		this.numberOfTransport = numberOfTransport;
		this.offnum = offnum;
		this.arrivenum = arrivenum;
		this.monitor = monitor;
		this.order_number = order_number;
		this.check_state = check_state;
	}

	public int getWays() {
		return ways;
	}

	public void setWays(int ways) {
		this.ways = ways;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getNumberOfTransfer() {
		return numberOfTransfer;
	}

	public void setNumberOfTransfer(String numberOfTransfer) {
		this.numberOfTransfer = numberOfTransfer;
	}

	public String getNumberOfTransport() {
		return numberOfTransport;
	}

	public void setNumberOfTransport(String numberOfTransport) {
		this.numberOfTransport = numberOfTransport;
	}

	public String getOffnum() {
		return offnum;
	}

	public void setOffnum(String offnum) {
		this.offnum = offnum;
	}

	public String getArrivenum() {
		return arrivenum;
	}

	public void setArrivenum(String arrivenum) {
		this.arrivenum = arrivenum;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public ArrayList<String> getOrder_number() {
		return order_number;
	}

	public void setOrder_number(ArrayList<String> order_number) {
		this.order_number = order_number;
	}

	public int getCheck_state() {
		return check_state;
	}

	public void setCheck_state(int check_state) {
		this.check_state = check_state;
	}

}
