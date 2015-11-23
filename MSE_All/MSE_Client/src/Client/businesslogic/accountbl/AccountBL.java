package Client.businesslogic.accountbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import Client.RMI_init.RMIHelper;
import Client.VO.AccountVO;
import Client.businesslogicservice.accountblservice.AccountBLService;
import Client.dataservice.accountdataservice.AccountDataService;
import PO.AccountPO;

public class AccountBL implements AccountBLService {
	AccountDataService accountData = RMIHelper.getAccountData();

	@Override
	public ArrayList<AccountVO> check() {

		ArrayList<AccountVO> acvlist = new ArrayList<>();
		try {
			ArrayList<AccountPO> acplist = accountData.check();
			for (AccountPO acp : acplist) {
				AccountVO acv = new AccountVO(acp.getName(), acp.getMoney(),
						acp.getDate(), acp.getCreator());
				acvlist.add(acv);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return acvlist;
	}

	@Override
	public void addAccount(String name, String money, String creator,
			String date) {

		AccountPO acpo = new AccountPO(name, money, date, creator);
		try {
			accountData.insert(acpo);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public ArrayList<AccountVO> updateAccount(int pos, String name,
			String creator, String date) {
		ArrayList<AccountVO> list = new ArrayList<>();
		ArrayList<AccountPO> acplist = new ArrayList<>();

		AccountPO acp = new AccountPO(name, "0", date, creator);
		try {
			acplist = accountData.update(acp, pos);
			for (AccountPO acpo : acplist) {
				AccountVO acv = new AccountVO(acpo.getName(), acpo.getMoney(),
						acpo.getDate(), acpo.getCreator());
				list.add(acv);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return list;
	}

	@Override
	public void deleteAccount(String name) {

		try {
			accountData.delete(name);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public ArrayList<AccountVO> findAccount(String key) {
		// TODO Auto-generated method stub
		return null;
	}

}
