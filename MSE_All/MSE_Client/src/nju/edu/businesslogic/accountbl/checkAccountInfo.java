package nju.edu.businesslogic.accountbl;

import java.util.ArrayList;

import PO.AccountPO;
import nju.edu.VO.AccountVO;

public interface checkAccountInfo {

	public ArrayList<AccountVO> check();

	public void save(AccountPO po);
}
