package PO;
import java.io.Serializable;

public class AccountPO implements Serializable {
	String acName; // �˻���
	double acMoney; // �˻����
	String acCreator; // ������
	String acDate; // ��������
	int acState; // ����״̬

	public AccountPO(String name, double money, String creator, String date,
			int state) {
		acName = name;
		acMoney = money;
		acCreator = creator;
		acDate = date;
		acState = state;
	}

    // ���ݹؼ���ģ������ʱ��
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
