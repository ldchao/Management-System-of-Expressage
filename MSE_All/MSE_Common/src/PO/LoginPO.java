package PO;

public class LoginPO {
	private String user; // �û���
	private String password; // ����
	private String limit; // Ȩ��
	private String name; // �û�����
	private String shop; // �û�����Ӫҵ��

	public LoginPO(String user, String password, String limit, String name,
			String shop) {
		super();
		this.user = user;
		this.password = password;
		this.limit = limit;
		this.name = name;
		this.shop = shop;
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
