package Client.businesslogic.accountbl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;

import Client.PO.AccountPO;
import Client.VO.AccountVO;
import Client.businesslogicservice.accountblservice.AccountBLService;

public class AccountBL implements AccountBLService {

	@Override
	public ArrayList<AccountVO> check() {

		ArrayList<AccountVO> aclist = new ArrayList<>();
		
		File acfile = new File("DataBase/Account.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(acfile));
			String str = "";
			while ((str = reader.readLine()) != "") {
				String line[] = str.split(";");
				AccountVO accountVO = new AccountVO(line[0], line[1], line[2], line[3]);
				aclist.add(accountVO);
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return aclist;
	}

	@Override
	public void addAccount(String name, double money, String creator,
			String date, int state) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAccount(AccountPO po, String name, double money,
			String creator, String date, int state) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAccount(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<AccountVO> findAccount(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args){
		AccountBL ac = new AccountBL();
		ArrayList<AccountVO> acvo = ac.check();
		for(AccountVO acv: acvo){
			System.out.println(acv.getAcName()+"  "+acv.getMoney()+"  "+acv.getDate()+"  "+acv.getCreator());
		}
	}
}
