package PO;

public class LoginPO {
	private String user; // �û���
	private String password; // ����
	private String limit; // Ȩ��
	private String name; // �û�����
	private String shop; // �û�����Ӫҵ��
	private boolean remember; // �ж��Ƿ��ס����

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
