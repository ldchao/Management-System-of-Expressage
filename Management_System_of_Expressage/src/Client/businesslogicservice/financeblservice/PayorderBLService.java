package Client.businesslogicservice.financeblservice;

import java.util.ArrayList;

import Client.PO.PayorderPO;
import Client.VO.PayorderVO;

public interface PayorderBLService {

	// �½����
	public void insert(double paymoney, String data, String payname,
			String payaccount, String list, String comment);

	// �鿴���ʱ��ʾ���и����Ϣ
	public ArrayList<PayorderVO> check();

	// �鿴�ɱ����棨������֧�������롢����
	public double profit(double[] pay, double[] payee);

	// ����������ǰ���ڵĳɱ������
	public void excel(String date, double income, double outcome, double benefit);
}
