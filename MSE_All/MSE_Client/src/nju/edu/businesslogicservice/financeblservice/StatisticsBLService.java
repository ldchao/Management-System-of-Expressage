package nju.edu.businesslogicservice.financeblservice;

import java.util.ArrayList;

import nju.edu.VO.PayeeorderVO;
import nju.edu.VO.PayorderVO;

public interface StatisticsBLService {

	// �鿴ѡ�����������еĸ�����տ��Ϣ
	public ArrayList<PayorderVO> checkPay(String start, String end);

	public ArrayList<PayeeorderVO> checkPayee(String start, String end);

	// ����������տ��Ϣ
	public void excel(ArrayList<PayorderVO> payVo,
			ArrayList<PayeeorderVO> payeeVo);
}
