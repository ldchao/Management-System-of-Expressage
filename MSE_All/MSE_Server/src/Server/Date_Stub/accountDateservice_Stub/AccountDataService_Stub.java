package Server.Date_Stub.accountDateservice_Stub;

import java.util.ArrayList;

import PO.AccountPO;
import Server.dataservice.accountdataservice.AccountDataService;

public class AccountDataService_Stub implements AccountDataService {

	@Override
	public void insert(AccountPO po) {
		// TODO Auto-generated method stub
		System.out.println("Insert Succeed!");
	}

	@Override
	public void update(AccountPO po) {
		// TODO Auto-generated method stub
		System.out.println("Insert Succeed!");
	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		System.out.println("Delete Succeed!");
	}

	@Override
	public ArrayList<AccountPO> find(String key) {
		// TODO Auto-generated method stub
		System.out.println("Find Succeed!");
		ArrayList<AccountPO> accountList = new ArrayList<AccountPO>();
		accountList.add(new AccountPO(key));   // “…Œ £°
		return accountList;
	}

}
