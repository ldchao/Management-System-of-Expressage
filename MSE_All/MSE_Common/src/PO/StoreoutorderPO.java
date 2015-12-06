package PO;
import java.io.Serializable;

import State.ApproveState;

//StoreoutorderPO�����ⵥ���������ݱ�š��������ڡ�Ŀ�ĵء�װ����ʽ����ת����š����״̬��
public class StoreoutorderPO implements Serializable {
	String order_number;  //��ݱ��  1
	String date;   //��������  2
	String arrivenum;   //Ŀ�ĵ�  3
	String way;   //װ����ʽ  4
	String numberOfTransport;  //��ת�����  5
	ApproveState check_state;   //���״̬   6

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
