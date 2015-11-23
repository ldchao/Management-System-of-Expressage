package Client.VO;

import java.io.Serializable;

public class StartinfoVO implements Serializable {
	private String name;
	private String account;
	private String organization;
	private String staff;
	private String vehicle;
	private String store;
	
	public StartinfoVO(String name, String account, String organization,
			String staff, String vehicle, String store) {
		super();
		this.name = name;
		this.account = account;
		this.organization = organization;
		this.staff = staff;
		this.vehicle = vehicle;
		this.store = store;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getStaff() {
		return staff;
	}

	public void setStaff(String staff) {
		this.staff = staff;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}
	
}
