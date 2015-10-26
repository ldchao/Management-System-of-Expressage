package Client.businesslogicservice.financeblservice;

import java.util.ArrayList;
import Client.PO.PayeeorderPO;

public interface ReceiFormBlService {
	
	//�½��տ
	public void addReceiForm(String data, ArrayList<Integer> price, 
			ArrayList<String> orderNum,String carrierName, String recorder);
	
	//����ܽ��
	public double getTotal(ArrayList<String> orderNum);
	
	//�����տ����
	public void endReceiForm();
	
	//����excel
	public void exportPayeeorder(PayeeorderPO po);
}
