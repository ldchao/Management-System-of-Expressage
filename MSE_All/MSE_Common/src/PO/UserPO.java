package PO;

import java.io.Serializable;

public class UserPO implements Serializable {
	private String name;
	private String key;
	private String limit;

	public UserPO(String name, String key, String limit) {
		super();
		this.name = name;
		this.key = key;
		this.limit = limit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}


}
