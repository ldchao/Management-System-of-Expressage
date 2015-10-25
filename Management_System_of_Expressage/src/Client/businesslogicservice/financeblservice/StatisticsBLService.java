package Client.businesslogicservice.financeblservice;

import java.util.ArrayList;

import Client.VO.vo.PayeeorderVO;
import Client.VO.vo.PayorderVO;

public interface StatisticsBLService {

	// �鿴ѡ�����������еĸ�����տ��Ϣ
	public ArrayList<PayorderVO> checkPay(String start, String end);

	public ArrayList<PayeeorderVO> checkPayee(String start, String end);

	// ����������տ��Ϣ
	public void excel(ArrayList<PayorderVO> payVo,
			ArrayList<PayeeorderVO> payeeVo);
}
