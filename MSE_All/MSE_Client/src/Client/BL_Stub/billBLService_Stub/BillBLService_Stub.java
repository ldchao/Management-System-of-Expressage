<<<<<<< HEAD:MSE_All/MSE_Client/src/Client/BL_Stub/billBLService_Stub/BillBLService_Stub.java
package Client.BL_Stub.billBLService_Stub;

import java.util.ArrayList;

import Client.VO.StartinfoVO;
import Client.businesslogicservice.billblservice.BillBLService;

public class BillBLService_Stub implements BillBLService {
	String startInsti; // ����
	String startStaff; // Ա��
	String startVehicle; // ����
	String startStore; // ���
	String startAccount; // �˻�
	String startDate; // ��������
	String startCreator; // ������
	int startState; // ����״̬
	
	public BillBLService_Stub(String startInsti, String startStaff,
			String startVehicle, String startStore, String startAccount,
			String startDate, String startCreator, int startState) {
		super();
		this.startInsti = startInsti;
		this.startStaff = startStaff;
		this.startVehicle = startVehicle;
		this.startStore = startStore;
		this.startAccount = startAccount;
		this.startDate = startDate;
		this.startCreator = startCreator;
		this.startState = startState;
	}

	@Override
	public void addBill(String name, String account, String organization,
			String staff, String vehicle, String store) {
		// TODO Auto-generated method stub
		System.out.println("Add Succeed!");
	}

	@Override
	public ArrayList<StartinfoVO> checkBill() {
		// TODO Auto-generated method stub
		ArrayList<StartinfoVO> infoList = new ArrayList<StartinfoVO>();
//		infoList.add(new StartinfoVO());
		return infoList;
	}

}
=======
package Client.BL_Stub.billBLService_Stub;

import java.util.ArrayList;

import Client.VO.StartinfoVO;
import Client.businesslogicservice.billblservice.BillBLService;

public class BillBLService_Stub implements BillBLService {
	String startInsti; // ����
	String startStaff; // Ա��
	String startVehicle; // ����
	String startStore; // ���
	String startAccount; // �˻�
	String startDate; // ��������
	String startCreator; // ������
	int startState; // ����״̬
	
	public BillBLService_Stub(String startInsti, String startStaff,
			String startVehicle, String startStore, String startAccount,
			String startDate, String startCreator, int startState) {
		super();
		this.startInsti = startInsti;
		this.startStaff = startStaff;
		this.startVehicle = startVehicle;
		this.startStore = startStore;
		this.startAccount = startAccount;
		this.startDate = startDate;
		this.startCreator = startCreator;
		this.startState = startState;
	}

	@Override
	public void addBill(String name, String account, String organization,
			String staff, String vehicle, String store) {
		// TODO Auto-generated method stub
		System.out.println("Add Succeed!");
	}

	@Override
	public ArrayList<StartinfoVO> checkBill() {
		// TODO Auto-generated method stub
		ArrayList<StartinfoVO> infoList = new ArrayList<StartinfoVO>();
//		infoList.add(new StartinfoVO());
		return infoList;
	}

}
>>>>>>> origin/master:Management_System_of_Expressage/src/Client/BL_Stub/billBLService_Stub/BillBLService_Stub.java
