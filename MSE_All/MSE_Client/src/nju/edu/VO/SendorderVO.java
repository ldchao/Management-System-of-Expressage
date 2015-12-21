package nju.edu.VO;

import java.util.ArrayList;

public class SendorderVO {
	String date;
	String sender;
	ArrayList<String> order;

	public SendorderVO(String date, String sender, ArrayList<String> order) {
		this.date=date;
		this.sender=sender;
		this.order=order;
	}

	/*
	 * getDate �������� return String
	 */
	public String getDate() {
		return date;
	}

	/*
	 * getSender ��������Ա return sender
	 */
	public String getSender() {
		return sender;
	}

	/*
	 * getOrder ���ض����б� return ArrayList<String>
	 */
	public ArrayList<String> getOrder() {
		return order;
	}

}