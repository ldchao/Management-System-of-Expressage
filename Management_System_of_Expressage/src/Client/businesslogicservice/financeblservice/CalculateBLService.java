package Client.businesslogicservice.financeblservice;

import java.util.ArrayList;

import Client.PO.PayeeorderPO;

public interface CalculateBLService {
	
	// �����ں�Ӫҵ���鿴�տ���Ϣ
	public ArrayList<PayeeorderPO> check(String data,String shop);
	
	// �������տ���
	public double total(double[] payee);
}
