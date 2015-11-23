package Client.businesslogicservice.vehicleblservice;

import Client.VO.DriverVO;

public interface DriverBlService {
	
	//����˾��
	public void addDriver(String driverNum, String name, String shopNum, String birthdata, 
			String idNum, String phoneNum, String sex, String licenseDue,
			String driverState);
	
	//����˾��
	public void updateDriver(String driverNum, String name, String shopNum, String birthdata, 
			String idNum, String phoneNum, String sex, String licenseDue,
			String driverState);
	
	//ɾ��˾��
	public void deleteDriver(String name);
	
	//����˾����Ϣ
	public void saveDriver();
	
	//����˾����Ϣ
	public DriverVO find(String name);
	

}