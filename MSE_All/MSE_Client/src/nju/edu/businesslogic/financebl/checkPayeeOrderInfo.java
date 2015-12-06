package nju.edu.businesslogic.financebl;

import java.util.ArrayList;

import nju.edu.VO.*;


public interface checkPayeeOrderInfo {
	
	public ArrayList<PayeeorderVO> checkPayeeorder(String date, String shop);
	
	public ArrayList<PayeeorderVO> checkPayeeorder();

}
