package PO;

import java.io.Serializable;

import State.ApproveState;

//StoreinorderPO����ⵥ���������ݱ�š�������ڡ�Ŀ�ĵء����š��źš��ܺš�λ�š�����״̬��
public class StoreinorderPO implements Serializable {

	String order_number; // ��ݱ�� 1
	String date; // ������� 2
	String offnum; // Ŀ�ĵ� 3
	String qu; // ���� 4
	String pai; // �ź� 5
	String jia; // �ܺ� 6
	String wei; // λ�� 7
	ApproveState check_state; // ����״̬ 8

	public StoreinorderPO(String order_number, String date, String offnum,
			String qu, String pai, String jia, String wei,
			ApproveState check_state) {
		super();
		this.order_number = order_number;
		this.date = date;
		this.offnum = offnum;
		this.qu = qu;
		this.pai = pai;
		this.jia = jia;
		this.wei = wei;		
		this.check_state = check_state;
	}

	public String getOrder_number() {
		return order_number;
	}

	public String getDate() {
		return date;
	}

	public String getOffnum() {
		return offnum;
	}

	public String getQu() {
		return qu;
	}

	public String getPai() {
		return pai;
	}

	public String getWei() {
		return wei;
	}

	public String getJia() {
		return jia;
	}

	public ApproveState getCheck_state() {
		return check_state;
	}

	public void setCheck_state(ApproveState check_state) {
		this.check_state = check_state;
	}

	
}
