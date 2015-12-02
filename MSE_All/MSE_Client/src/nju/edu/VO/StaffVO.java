package nju.edu.VO;

import java.io.Serializable;

public class StaffVO implements Serializable{
	//人员信息
	String id;
	String name;
	//员工地址
	String address;
	//员工职位
	String position;
	String phone;
	String cellphone;
	//员工单位
	String shop;
	public StaffVO(String id, String name, String address, String position, String phone, String cellphone,
			String shop) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.position = position;
		this.phone = phone;
		this.cellphone = cellphone;
		this.shop = shop;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getShop() {
		return shop;
	}
	public void setShop(String shop) {
		this.shop = shop;
	}
	
	
}
