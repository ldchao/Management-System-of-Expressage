package PO;
import java.io.Serializable;

import State.ApproveState;
import State.ExpressType;
import State.PackageType;


public class OrderPO implements Serializable{
	private String courier;
	private String id;
	private ApproveState state;
	
	//寄件人信息
	private String sender;
	private String address1;
	private String position1;
	private String phone1;
	private String cellphone1;
	
	//收件人信息
	private String receiver;
	private String address2;
	private String position2;
	private String phone2;
	private String cellphone2;
	
	//寄件信息
	private String items;
	private double count;
	private double weight;
	private double length;
	private double width;
	private double height;
	
	//快递种类
	private ExpressType express;
	
	//包装类型
	private PackageType pack;
	
	//付款和预计时间
	private double bill;
	private String time;

	//物流信息
	private String transformState;

	public OrderPO(String courier, String id, ApproveState state, String sender, String address1, String position1,
			String phone1, String cellphone1, String receiver, String address2, String position2, String phone2,
			String cellphone2, String items, double count, double weight, double length, double width, double height,
			ExpressType express, PackageType pack, double bill, String time, String transformState) {
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
		this.items = items;
		this.count = count;
		this.weight = weight;
		this.length = length;
		this.width = width;
		this.height = height;
		this.express = express;
		this.pack = pack;
		this.bill = bill;
		this.time = time;
		this.transformState = transformState;
	}

	public String getCourier() {
		return courier;
	}

	public void setCourier(String courier) {
		this.courier = courier;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ApproveState getState() {
		return state;
	}

	public void setState(ApproveState state) {
		this.state = state;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getPosition1() {
		return position1;
	}

	public void setPosition1(String position1) {
		this.position1 = position1;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getCellphone1() {
		return cellphone1;
	}

	public void setCellphone1(String cellphone1) {
		this.cellphone1 = cellphone1;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getPosition2() {
		return position2;
	}

	public void setPosition2(String position2) {
		this.position2 = position2;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getCellphone2() {
		return cellphone2;
	}

	public void setCellphone2(String cellphone2) {
		this.cellphone2 = cellphone2;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public double getCount() {
		return count;
	}

	public void setCount(double count) {
		this.count = count;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public ExpressType getExpress() {
		return express;
	}

	public void setExpress(ExpressType express) {
		this.express = express;
	}

	public PackageType getPack() {
		return pack;
	}

	public void setPack(PackageType pack) {
		this.pack = pack;
	}

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTransformState() {
		return transformState;
	}

	public void setTransformState(String transformState) {
		this.transformState = transformState;
	}

	
}
