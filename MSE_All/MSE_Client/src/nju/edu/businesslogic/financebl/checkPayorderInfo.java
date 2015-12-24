package nju.edu.businesslogic.financebl;

import java.util.ArrayList;

import PO.PayorderPO;
import nju.edu.VO.PayorderVO;

public interface checkPayorderInfo {

	public ArrayList<PayorderVO> checkPayorder();

	public void save(PayorderPO po);
	
	public ArrayList<PayorderVO> checkUncheckedPayorder();
}
