package Client.BL_Stub.accountBLService_Stub;

import java.util.ArrayList;

import Client.PO.AccountPO;
import Client.VO.AccountVO;
import Client.businesslogicservice.accountblservice.AccountBLService;

public class AccountBLService_Stub implements AccountBLService{
	String acName; // �˻���
	double acMoney; // �˻����
	String acCreator; // ������
	String acDate; // ��������
	int acState; // ����״̬

	public AccountBLService_Stub(String acName, double acMoney,
			String acCreator, String acDate, int acState) {
		super();
		this.acName = acName;
		this.acMoney = acMoney;
		this.acCreator = acCreator;
		this.acDate = acDate;
		this.acState = acState;
	}

	@Override
	public ArrayList<AccountVO> check() {
		// TODO Auto-generated method stub
		return new ArrayList<AccountVO>();
	}

	@Override
	public void addAccount(String name, double money, String creator,
			String date, int state) {
		// TODO Auto-generated method stub
		System.out.println("Add Succeed!");
	}

	@Override
	public void updateAccount(AccountPO po, String name, double money,
			String creator, String date, int state) {
		// TODO Auto-generated method stub
		System.out.println("Update Succeed!");
	}

	@Override
	public void deleteAccount(String name) {
		// TODO Auto-generated method stub
		System.out.println("Delete Succeed!");
	}

	@Override
	public ArrayList<AccountVO> findAccount(String key) {
		// TODO Auto-generated method stub
		ArrayList<AccountVO> accountList = new ArrayList<AccountVO>();
		accountList.add(new AccountVO(key, key, key, key));//
		return accountList;
	}

	

}
