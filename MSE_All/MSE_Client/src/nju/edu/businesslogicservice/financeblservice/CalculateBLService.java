package nju.edu.businesslogicservice.financeblservice;

import java.util.ArrayList;

import nju.edu.VO.PayeeorderVO;

public interface CalculateBLService {
	
	// �����ں�Ӫҵ���鿴�տ���Ϣ
	public ArrayList<PayeeorderVO> check(String data,String shop);
	
	// �������տ���
	public double total(double[] payee);
}
