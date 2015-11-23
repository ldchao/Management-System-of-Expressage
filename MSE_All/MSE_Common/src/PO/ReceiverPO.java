package PO;
import java.io.Serializable;


public class ReceiverPO implements Serializable{
	//快递员及其电话和订单号
	String courier;
	String phoneOfcourier;
	String id;
	
	//收件人信息
	String receiver;
	String address;
	String time;
	String cellphone;
	
	public ReceiverPO(String courier, String phoneOfcourier, String id,
			String receiver, String address, String time, String cellphone) {
		super();
		this.courier = courier;
		this.phoneOfcourier = phoneOfcourier;
		this.id = id;
		this.receiver = receiver;
		this.address = address;
		this.time = time;
		this.cellphone = cellphone;
	}

	public String getCourier() {
		return courier;
	}

	public String getPhoneOfcourier() {
		return phoneOfcourier;
	}

	public String getId() {
		return id;
	}

	public String getReceiver() {
		return receiver;
	}

	public String getAddress() {
		return address;
	}

	public String getTime() {
		return time;
	}

	public String getCellphone() {
		return cellphone;
	}
	
	
}
