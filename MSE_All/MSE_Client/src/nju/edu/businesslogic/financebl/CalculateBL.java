package nju.edu.businesslogic.financebl;

import java.util.ArrayList;

import nju.edu.VO.PayeeorderVO;
import nju.edu.businesslogicservice.financeblservice.CalculateBLService;

public class CalculateBL implements CalculateBLService{

	@Override
	public ArrayList<PayeeorderVO> check(String date, String shop) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double total(double[] payee) {
		// TODO Auto-generated method stub
		double result = 0;
		for(int i=0;i<payee.length;i++){
			result += payee[i];
		}
		return result;
	}

}