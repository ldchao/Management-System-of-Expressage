package Client.VO;

import java.io.Serializable;

public class StaffVO implements Serializable{
	//人员信息
	String name;
	String address;
	String position;
	String phone;
	String cellphone;
	
	public StaffVO(String name, String address, String position, String phone,
			String cellphone) {
		super();
		this.name = name;
		this.address = address;
		this.position = position;
		this.phone = phone;
		this.cellphone = cellphone;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPosition() {
		return position;
	}

	public String getPhone() {
		return phone;
	}

	public String getCellphone() {
		return cellphone;
	}

	
}
