package Client.businesslogicservice.vehicleblservice;

import Client.VO.VehicleVO;

public interface VehicleBlService {
	
	//增加车辆
	public void addVehicle(String carNum, String engineNum, String car, String baseNum, 
			String buyData, String useData, String carState);
	
	//更新车辆
	public void updateVehicle(String carNum, String engineNum, String car, String baseNum, 
			String buyData, String useData, String carState);
	
	//删除车辆
	public void deleteVehicle(String carNum);
	
	//保存车辆信息
	public void saveVehicle();
	
	//查找车辆信息
	public VehicleVO find(String carNum);
	

}
