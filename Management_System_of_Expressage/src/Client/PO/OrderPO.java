package Client.PO;
import java.io.Serializable;


public class OrderPO implements Serializable{
	//快递员和订单号和单据审批状态
	String courier;
	String id;
	int state;
	
	//寄件人信息
	String sender;
	String address1;
	String position1;
	String phone1;
	String cellphone1;
	
	//收件人信息
	String receiver;
	String address2;
	String position2;
	String phone2;
	String cellphone2;
	
	//寄件信息
	String count;
	int weight;
	int length;
	int width;
	int height;
	String items;
	
	//快递种类
	int express;
	
	//包装类型
	int pack;
	
	//付款和预计时间
	double bill;
	String time;

	//物流信息
	String transformState;

	public OrderPO(String courier, String id, int state, String sender,
			String address1, String position1, String phone1,
			String cellphone1, String receiver, String address2,
			String position2, String phone2, String cellphone2, String count,
			int weight, int length, int width, int height, String items,
			int express, int pack, double bill, String time,
			String transformState) {
		super();
		this.courier = courier;
		this.id = id;
		this.state = state;
		this.sender = sender;
		this.address1 = address1;
		this.position1 = position1;
		this.phone1 = phone1;
		this.cellphone1 = cellphone1;
		this.receiver = receiver;
		this.address2 = address2;
		this.position2 = position2;
		this.phone2 = phone2;
		this.cellphone2 = cellphone2;
		this.count = count;
		this.weight = weight;
		this.length = length;
		this.width = width;
		this.height = height;
		this.items = items;
		this.express = express;
		this.pack = pack;
		this.bill = bill;
		this.time = time;
		this.transformState = transformState;
	}

	public String getCourier() {
		return courier;
	}

	public String getId() {
		return id;
	}

	public int getState() {
		return state;
	}

	public String getSender() {
		return sender;
	}

	public String getAddress1() {
		return address1;
	}

	public String getPosition1() {
		return position1;
	}

	public String getPhone1() {
		return phone1;
	}

	public String getCellphone1() {
		return cellphone1;
	}

	public String getReceiver() {
		return receiver;
	}

	public String getAddress2() {
		return address2;
	}

	public String getPosition2() {
		return position2;
	}

	public String getPhone2() {
		return phone2;
	}

	public String getCellphone2() {
		return cellphone2;
	}

	public String getCount() {
		return count;
	}

	public int getWeight() {
		return weight;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public String getItems() {
		return items;
	}

	public int getExpress() {
		return express;
	}

	public int getPack() {
		return pack;
	}

	public double getBill() {
		return bill;
	}

	public String getTime() {
		return time;
	}

	public String getTransformState() {
		return transformState;
	}

	public void setTransformState(String transformState) {
		this.transformState = transformState;
	}
	
	
	
}
