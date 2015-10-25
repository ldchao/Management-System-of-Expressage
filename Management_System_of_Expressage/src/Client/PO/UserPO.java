package Client.PO;

import java.io.Serializable;

public class UserPO implements Serializable {
	String userName; // 用户名
	String userKey; // 密码
	String userLimit; // 用户权限

	public UserPO(String name, String key, String limit) {
		userName = name;
		userKey = key;
		userLimit = limit;
	}

	public String getName() {
		return userName;
	}

	public String getKey() {
		return userKey;
	}

	public String getLimit() {
		return userLimit;
	}

}
