<<<<<<< HEAD:MSE_All/MSE_Client/src/Client/businesslogicservice/billblservice/BillBLService.java
package Client.businesslogicservice.billblservice;

import java.util.ArrayList;

import Client.VO.StartinfoVO;

public interface BillBLService {

	// �½���
	public void addBill(String name, String account, String organization,
			String staff, String vehicle, String store);

	// �鿴�ڳ���Ϣʱ��ʾ�����ʵ���Ϣ
	public ArrayList<StartinfoVO> checkBill();
}
=======
package Client.businesslogicservice.billblservice;

import java.util.ArrayList;

import Client.VO.StartinfoVO;

public interface BillBLService {

	// �½���
	public void addBill(String name, String account, String organization,
			String staff, String vehicle, String store);

	// �鿴�ڳ���Ϣʱ��ʾ�����ʵ���Ϣ
	public ArrayList<StartinfoVO> checkBill();
}
>>>>>>> origin/master:Management_System_of_Expressage/src/Client/businesslogicservice/billblservice/BillBLService.java
