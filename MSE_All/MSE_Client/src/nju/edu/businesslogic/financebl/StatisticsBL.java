package nju.edu.businesslogic.financebl;

import java.util.ArrayList;

import nju.edu.VO.PayeeorderVO;
import nju.edu.VO.PayorderVO;
import nju.edu.businesslogicservice.financeblservice.StatisticsBLService;

public class StatisticsBL implements StatisticsBLService {

	@Override
	public ArrayList<PayorderVO> checkPay(int start, int end) {
		checkPayorderInterface check = new PayorderBL();

		ArrayList<PayorderVO> list = new ArrayList<>();
		ArrayList<PayorderVO> payvo = check.checkPayorder();
		for (PayorderVO vo : payvo) {
			int date = Integer.valueOf(vo.getDate().replaceAll("-", ""));
			if (date >= start && date <= end)
				list.add(vo);
		}

		return list;
	}

	@Override
	public ArrayList<PayeeorderVO> checkPayee(int start, int end) {
		checkPayeeOrderInterface check = new PayeeorderBL();

		ArrayList<PayeeorderVO> list = new ArrayList<>();
		ArrayList<PayeeorderVO> payeevo = check.checkPayeeorder();
		for (PayeeorderVO vo : payeevo) {
			int date = Integer.valueOf(vo.getDate().replaceAll("-", ""));
			if (date >= start && date <= end)
				list.add(vo);
		}

		return list;
	}

	@Override
	public void excel(ArrayList<PayorderVO> payVo,
			ArrayList<PayeeorderVO> payeeVo) {
		// TODO Auto-generated method stub

	}
}
