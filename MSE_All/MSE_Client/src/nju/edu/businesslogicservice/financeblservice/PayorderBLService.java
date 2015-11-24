package nju.edu.businesslogicservice.financeblservice;

import java.util.ArrayList;

import nju.edu.VO.PayeeorderVO;
import nju.edu.VO.PayorderVO;

public interface PayorderBLService {

	// �½����
	public void addPayorder(double paymoney, String date, String payname,
			String payaccount, String list, String comment);

	// �鿴���ʱ��ʾ���и����Ϣ
	public ArrayList<PayorderVO> checkPayorder();

	// �鿴�ɱ����棨������֧�������롢����
	public double[] profit(ArrayList<PayorderVO> pay,
			ArrayList<PayeeorderVO> payee);

	// ����������ǰ���ڵĳɱ������
	public void excel(String date, double income, double outcome, double benefit);
}