package Client.businesslogicservice.loadblservice;

import java.util.ArrayList;
import Client.PO.send_LoadorderPO;

public interface LoadBlService {
	
	//�½�װ����
	public void addLoadOrder(String data, String shop, String carShippingNum,
			String arrival, String vehicleNum, String monitor, String transfer, 
			ArrayList<String> orderNum);
	
	//����˷��ܼ�
	public double getTotal(String arrival);
	
	//����װ����
	public void endLoad();
	
	//����
	public void exportLoad(send_LoadorderPO po);
	

}
