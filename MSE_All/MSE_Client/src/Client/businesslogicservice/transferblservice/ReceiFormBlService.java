<<<<<<< HEAD:MSE_All/MSE_Client/src/Client/businesslogicservice/transferblservice/ReceiFormBlService.java
package Client.businesslogicservice.transferblservice;

import java.util.ArrayList;

import PO.ReceiveorderPO;

public interface ReceiFormBlService {
    
	//�½����յ�
	public void addReceiveOrder(String data, String changeOrderNum, String departPlace,
			String arriveState, ArrayList<String> orderNum, String name);
	
	//������յ�
	public void endRecei();
	
	//����
	public void exportReceiOrder(ReceiveorderPO po);
}
=======
package Client.businesslogicservice.transferblservice;

import Client.PO.ReceiveorderPO;

import java.util.ArrayList;

public interface ReceiFormBlService {
    
	//�½����յ�
	public void addReceiveOrder(String data, String changeOrderNum, String departPlace,
			String arriveState, ArrayList<String> orderNum, String name);
	
	//������յ�
	public void endRecei();
	
	//����
	public void exportReceiOrder(ReceiveorderPO po);
}
>>>>>>> origin/master:Management_System_of_Expressage/src/Client/businesslogicservice/transferblservice/ReceiFormBlService.java
