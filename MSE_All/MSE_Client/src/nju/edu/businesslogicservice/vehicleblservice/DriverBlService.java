package nju.edu.businesslogicservice.vehicleblservice;

import nju.edu.VO.DriverVO;

public interface DriverBlService {
	
	//����˾��
	public void addDriver(DriverVO vo);
	
	//����˾��
	public void updateDriver(DriverVO vo);
	
	//ɾ��˾��
	public void deleteDriver(String name);
	
	//����˾����Ϣ
	public boolean searchDriver(String name);
	
	//����˾����Ϣ
	public DriverVO find(String name);
	

}