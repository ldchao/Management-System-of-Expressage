package PO;
import java.io.Serializable;

//ArriverorderPO（到达单）类包含到达日期、中转单编号、出发地、货物到达状态、审批状态。

public class ArriverorderPO implements Serializable {

	String numberOfTransferStation;
	String date;
	String offnum;
	int arrive_state;
	int check_state;

	public ArriverorderPO(String numberOfTransferStation, String date,
			String offnum, int arrive_state, int check_state) {
		super();
		this.numberOfTransferStation = numberOfTransferStation;
		this.date = date;
		this.offnum = offnum;
		this.arrive_state = arrive_state;
		this.check_state = check_state;
	}

	public String getNumberOfTransferStation() {
		return numberOfTransferStation;
	}

	public void setNumberOfTransferStation(String numberOfTransferStation) {
		this.numberOfTransferStation = numberOfTransferStation;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getOffnum() {
		return offnum;
	}

	public void setOffnum(String offnum) {
		this.offnum = offnum;
	}

	public int getArrive_state() {
		return arrive_state;
	}

	public void setArrive_state(int arrive_state) {
		this.arrive_state = arrive_state;
	}

	public int getCheck_state() {
		return check_state;
	}

	public void setCheck_state(int check_state) {
		this.check_state = check_state;
	}

}
