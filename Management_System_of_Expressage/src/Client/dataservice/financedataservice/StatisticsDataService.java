package Client.dataservice.financedataservice;

import java.util.ArrayList;

import Client.PO.PayeeorderPO;
import Client.PO.PayorderPO;

public interface StatisticsDataService {

	// ������ʼ�ͽ������ڲ���ѡ�����������еĸ�����տ��Ϣ
	public ArrayList<PayorderPO> findPay(String start, String end);

	public ArrayList<PayeeorderPO> findPayee(String start, String end);

	// ����������տ��Ϣ
	public void excel(ArrayList<PayorderPO> payVo,
			ArrayList<PayeeorderPO> payeeVo);
}
