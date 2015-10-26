package Client.PO;

import java.io.Serializable;

public class StartinfoPO implements Serializable {
	String startInsti; // 机构
	String startStaff; // 员工
	String startVehicle; // 车辆
	String startStore; // 库存
	String startAccount; // 账户
	String startDate; // 创建日期
	String startCreator; // 创建者
	int startState; // 审批状态

	public StartinfoPO(String insti, String staff, String vehicle,
			String store, String account, String date, String creator, int state) {
		startInsti = insti;
		startStaff = staff;
		startVehicle = vehicle;
		startStore = store;
		startAccount = account;
		startDate = date;
		startCreator = creator;
		startState = state;
	}

	// 显示所有账时用
	public StartinfoPO() {
		// TODO Auto-generated constructor stub
	}

	public String getStartInsti() {
		return startInsti;
	}

	public String getStartStaff() {
		return startStaff;
	}

	public String getStartVehicle() {
		return startVehicle;
	}

	public String getStartStore() {
		return startStore;
	}

	public String getStartAccount() {
		return startAccount;
	}

	public String getStartData() {
		return startDate;
	}

	public String getStartCreator() {
		return startCreator;
	}

	public int getStartState() {
		return startState;
	}

}
