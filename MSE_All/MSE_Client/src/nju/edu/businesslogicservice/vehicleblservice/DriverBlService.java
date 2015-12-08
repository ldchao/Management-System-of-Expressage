package nju.edu.businesslogicservice.vehicleblservice;

import nju.edu.VO.DriverVO;

public interface DriverBlService {
	
	//增加司机
	public void addDriver(DriverVO vo);
	
	//更新司机
	public void updateDriver(DriverVO vo);
	
	//删除司机
	public void deleteDriver(String name);
	
	//保存司机信息
	public boolean searchDriver(String name);
	
	//查找司机信息
	public DriverVO find(String name);
	

}