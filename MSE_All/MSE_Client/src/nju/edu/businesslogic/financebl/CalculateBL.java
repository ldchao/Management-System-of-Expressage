package nju.edu.businesslogic.financebl;

import java.util.ArrayList;

import nju.edu.VO.PayeeorderVO;
import nju.edu.businesslogicservice.financeblservice.CalculateBLService;

public class CalculateBL implements CalculateBLService {

	@Override
	public ArrayList<PayeeorderVO> check(String date, String shop) {
		checkPayeeOrderInterface checkpayee = new PayeeorderBL();
		ArrayList<PayeeorderVO> payeevo = checkpayee
				.checkPayeeorder(date, shop);

		return payeevo;
	}

	@Override
	public double total(ArrayList<PayeeorderVO> volist) {
		double result = 0;
		for (PayeeorderVO vo : volist)
			result += vo.getMoney();

		return result;
	}

}
