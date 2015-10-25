import java.io.Serializable;

public class StartinfoPO implements Serializable {
	String startInsti; // institution
	String startStaff;
	String startVehicle;
	String startStore;
	String startAccount;
	String startDate;
	String startCreator;
	int startState;

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
