package PO;

import java.io.Serializable;
import java.util.ArrayList;

public class PayeeorderPO implements Serializable {
	String date;
	String carrierName;
	String recorder;
	ArrayList<String> order;
	ArrayList<Integer> price;

	public PayeeorderPO(String date, String carrierName, String recorder,
			ArrayList<String> order, ArrayList<Integer> price) {
		date = this.date;
		carrierName = this.carrierName;
		recorder = this.recorder;
		order = this.order;
		price = this.price;
	}

	// 鏄剧ず鎵�鏈変粯娆惧崟鏃剁敤
	public PayeeorderPO() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * getDate 杩斿洖鏀舵鍗曟棩鏈� return String
	 */
	public String getDate() {
		return date;
	}

	/*
	 * getCarrierName 杩斿洖蹇�掑憳濮撳悕 return String
	 */
	public String getCarrierName() {
		return carrierName;
	}

	/*
	 * getRecorder 杩斿洖璁板綍鍛樺鍚� return String
	 */
	public String getRecorder() {
		return recorder;
	}

	/*
	 * getOrder 杩斿洖璁㈠崟鍙锋竻鍗� return ArrayList<String>
	 */
	public ArrayList<String> getOrder() {
		return order;
	}

	/*
	 * getPrice 杩斿洖浠锋牸娓呭崟 return ArrayList<Integer>
	 */
	public ArrayList<Integer> getPrice() {
		return price;
	}

}
