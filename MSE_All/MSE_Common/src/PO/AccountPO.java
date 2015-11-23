package PO;
import java.io.Serializable;

public class AccountPO implements Serializable {
	String acName; // 账户名
	double acMoney; // 账户余额
	String acCreator; // 建账人
	String acDate; // 建账日期
	int acState; // 审批状态

	public AccountPO(String name, double money, String creator, String date,
			int state) {
		acName = name;
		acMoney = money;
		acCreator = creator;
		acDate = date;
		acState = state;
	}

    // 根据关键字模糊查找时用
	public AccountPO(String key) {
		// TODO Auto-generated constructor stub
	}

	public String getAcName() {
		return acName;
	}

	public double getAcMoney() {
		return acMoney;
	}

	public String getAcCreator() {
		return acCreator;
	}

	public String getAcDate() {
		return acDate;
	}

	public int getAcCtate() {
		return acState;
	}

}
