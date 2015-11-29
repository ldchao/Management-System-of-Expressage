package PO;

public class LoginPO {
	private String user; // 用户名
	private String password; // 密码
	private String limit; // 权限
	private String name; // 用户姓名
	private String shop; // 用户所在营业厅
	private boolean remember; // 判断是否记住密码

	public LoginPO(String user, String password, String limit, String name,
			String shop) {
		super();
		this.user = user;
		this.password = password;
		this.limit = limit;
		this.name = name;
		this.shop = shop;
		remember = false;
	}

	public boolean getRemember() {
		return remember;
	}

	public void setRemember(boolean remember) {
		this.remember = remember;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	public String getLimit() {
		return limit;
	}

	public String getName() {
		return name;
	}

	public String getShop() {
		return shop;
	}

}
