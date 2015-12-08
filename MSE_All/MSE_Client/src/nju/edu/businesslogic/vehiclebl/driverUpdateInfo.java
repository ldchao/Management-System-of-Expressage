package nju.edu.businesslogic.vehiclebl;

import State.DriverState;

public interface driverUpdateInfo {
	
	//更新司机信息
	public boolean update(String name, DriverState state);

}
