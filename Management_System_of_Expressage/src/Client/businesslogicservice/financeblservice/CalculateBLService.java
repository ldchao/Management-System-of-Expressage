package Client.businesslogicservice.financeblservice;

import java.util.ArrayList;

import Client.VO.PayeeorderVO;

public interface CalculateBLService {
	
	// �����ں�Ӫҵ���鿴�տ���Ϣ
	public ArrayList<PayeeorderVO> check(String data,String shop);
	
	// �������տ���
	public double total(double[] payee);
}
