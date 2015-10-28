package Client.VO;

import java.io.Serializable;

public class ConstantVO implements Serializable{
	String address1;
	String address2;
	double distance;
	double price;
	
	public ConstantVO(String address1, String address2, double distance,
			double price) {
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
	
	
}
