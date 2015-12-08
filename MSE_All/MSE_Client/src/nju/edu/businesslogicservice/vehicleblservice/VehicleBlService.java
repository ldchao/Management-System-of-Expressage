package nju.edu.businesslogicservice.vehicleblservice;

import nju.edu.VO.VehicleVO;

public interface VehicleBlService {
	
	//增加车辆
	public void addVehicle(VehicleVO vo);
	
	//更新车辆
	public void updateVehicle(VehicleVO vo);
	
	//删除车辆
	public void deleteVehicle(String carNum);
	
	//查询是否存在
	public boolean searchVehicle(String carNum);
	
	//查找车辆信息
	public VehicleVO find(String carNum);
	
	
	

}
