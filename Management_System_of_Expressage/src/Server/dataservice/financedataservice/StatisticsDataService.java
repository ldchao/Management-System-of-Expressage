package Server.dataservice.financedataservice;

import java.util.ArrayList;

import Client.VO.PayeeorderVO;
import Client.VO.PayorderVO;

public interface StatisticsDataService {

	// ������ʼ�ͽ������ڲ���ѡ�����������еĸ�����տ��Ϣ
	public ArrayList<PayorderVO> findPay(String start, String end);

	public ArrayList<PayeeorderVO> findPayee(String start, String end);

	// ����������տ��Ϣ
	public void excel(ArrayList<PayorderVO> payVo,
			ArrayList<PayeeorderVO> payeeVo);
}
