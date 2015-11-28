package nju.edu.businesslogic.financebl;

import java.util.ArrayList;

import PO.PayeeorderPO;
import nju.edu.VO.*;


public interface checkPayeeOrderInterface {
	
	public ArrayList<PayeeorderVO> checkPayeeorder(String date, String shop);
	
	public ArrayList<PayeeorderVO> checkPayeeorder();

}
