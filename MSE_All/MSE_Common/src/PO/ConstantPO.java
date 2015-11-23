package PO;
import java.io.Serializable;


public class ConstantPO implements Serializable{
	//常量信息
	String address1;
	String address2;
	double distance;
	double price;
	
	public ConstantPO(String address1, String address2, double distance, double price) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.distance = distance;
		this.price = price;
	}

	public String getAddress1() {
		return address1;
	}

	public String getAddress2() {
		return address2;
	}

	public double getDistance() {
		return distance;
	}

	public double getPrice() {
		return price;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
