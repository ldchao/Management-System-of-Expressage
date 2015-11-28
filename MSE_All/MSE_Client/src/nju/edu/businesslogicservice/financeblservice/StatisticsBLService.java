package nju.edu.businesslogicservice.financeblservice;

import java.util.ArrayList;

import nju.edu.VO.PayeeorderVO;
import nju.edu.VO.PayorderVO;

public interface StatisticsBLService {

	// �鿴ѡ�����������еĸ�����տ��Ϣ
	public ArrayList<PayorderVO> checkPay(int start, int end);

	public ArrayList<PayeeorderVO> checkPayee(int start, int end);

	// ����������տ��Ϣ
	public void excel(ArrayList<PayorderVO> payVo,
			ArrayList<PayeeorderVO> payeeVo);
}
