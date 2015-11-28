package nju.edu.VO;

import java.io.Serializable;

import State.ApproveState;

@SuppressWarnings("serial")
public class PayeeorderVO implements Serializable {
	String order;
	double money;
	String date;
	String carrierName;
	String shopperName;
	String shop;

	public PayeeorderVO(String order, double money, String date,
			String carrierName, String shopperName,String shop) {
		super();
		this.order = order;
		this.money = money;
		this.date = date;
		this.carrierName = carrierName;
		this.shopperName = shopperName;
		this.shop = shop;
	}
	
	public String getShop(){
		return this.shop;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getShopperName() {
		return shopperName;
	}

	public void setShopperName(String shopperName) {
		this.shopperName = shopperName;
	}

}
