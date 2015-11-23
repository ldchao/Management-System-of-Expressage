package PO;
import java.io.Serializable;


public class StaffPO implements Serializable{
	//人员信息
	String name;
	String address;
	String position;
	String phone;
	String cellphone;
	
	public StaffPO(String name, String address, String position, String phone,
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

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	
	
}
