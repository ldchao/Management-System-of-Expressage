package Client.BL_Stub.billBLService_Stub;

import java.util.ArrayList;

import Client.VO.StartinfoVO;
import Client.businesslogicservice.billblservice.BillBLService;

public class BillBLService_Stub implements BillBLService {
	String startInsti; // 机构
	String startStaff; // 员工
	String startVehicle; // 车辆
	String startStore; // 库存
	String startAccount; // 账户
	String startDate; // 创建日期
	String startCreator; // 创建者
	int startState; // 审批状态
	
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
	public void addBill(String institution, String staff, String vehicle,
			String store, String account, String data, String creator) {
		// TODO Auto-generated method stub
		System.out.println("Add Succeed!");
	}

	@Override
	public ArrayList<StartinfoVO> checkBill() {
		// TODO Auto-generated method stub
		ArrayList<StartinfoVO> infoList = new ArrayList<StartinfoVO>();
		infoList.add(new StartinfoVO());
		return infoList;
	}

}
