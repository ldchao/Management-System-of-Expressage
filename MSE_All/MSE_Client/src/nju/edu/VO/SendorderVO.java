package nju.edu.VO;

import java.util.ArrayList;

public class SendorderVO {
	String date;
	String sender;
	ArrayList<String> order;

	public SendorderVO(String date, String sender, ArrayList<String> order) {
		date = this.date;
		sender = this.sender;
		order = this.order;
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
