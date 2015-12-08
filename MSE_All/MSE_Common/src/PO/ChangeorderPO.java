package PO;

import java.io.Serializable;
import java.util.ArrayList;

import State.ApproveState;

//ChangeorderPO����ת���������װ�����ڡ�����ת������ת����š������ء�����ء�װ�˷�ʽ����װԱ��������ת���е��š�����״̬
public class ChangeorderPO implements Serializable {

	String date; // װ������ 2
	String numberOfTransfer; // ����ת������ת����� 1
	String offnum; // ������ 3
	String arrivenum; // ����� 4
	String wayOfTransport; // װ�˷�ʽ 5
	String monitor; // ��װԱ 6
	ArrayList<String> order_number; // ������ת���е��� 7
	ApproveState check_state; // ����״̬ 8

	public ChangeorderPO(String date, String numberOfTransfer, String offnum,
			String arrivenum, String wayOfTransport, String monitor,
			ArrayList<String> order_number, ApproveState check_state) {
		super();
		this.date = date;
		this.numberOfTransfer = numberOfTransfer;
		this.offnum = offnum;
		this.arrivenum = arrivenum;
		this.wayOfTransport = wayOfTransport;
		this.monitor = monitor;
		this.order_number = order_number;
		this.check_state = check_state;
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

	public ApproveState getCheck_state() {
		return check_state;
	}

	public void setCheck_state(ApproveState check_state) {
		this.check_state = check_state;
	}
}
