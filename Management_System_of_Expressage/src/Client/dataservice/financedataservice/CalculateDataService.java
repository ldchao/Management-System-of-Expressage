package Client.dataservice.financedataservice;

import java.util.ArrayList;

import Client.PO.PayeeorderPO;

public interface CalculateDataService {
	
	// �����ں�Ӫҵ�������տ���Ϣ
	public ArrayList<PayeeorderPO> find(String data,String shop);
	
	// �������տ���
	public double total(double[] payee);
}
