package Client.BL_Stub.accountBLService_Stub;

import java.util.ArrayList;

import Client.VO.AccountVO;
import Client.businesslogicservice.accountblservice.AccountBLService;

public class AccountBLService_Stub implements AccountBLService {
	String acName; // 账户名
	double acMoney; // 账户余额
	String acCreator; // 建账人
	String acDate; // 建账日期
	int acState; // 审批状态

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
	public ArrayList<AccountVO> updateAccount(int pos,String name, String creator, String date,
			int state) {
		// TODO Auto-generated method stub
		System.out.println("Update Succeed!");
		return null;
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
