package Client.businesslogicservice.vehicleblservice;

import Client.VO.DriverVO;

public interface DriverBlService {
	
	//增加司机
	public void addDriver(String driverNum, String name, String shopNum, String birthdata, 
			String idNum, String phoneNum, String sex, String licenseDue,
			String driverState);
	
	//更新司机
	public void updateDriver(String driverNum, String name, String shopNum, String birthdata, 
			String idNum, String phoneNum, String sex, String licenseDue,
			String driverState);
	
	//删除司机
	public void deleteDriver(String name);
	
	//保存司机信息
	public void saveDriver();
	
	//查找司机信息
	public DriverVO find(String name);
	

}