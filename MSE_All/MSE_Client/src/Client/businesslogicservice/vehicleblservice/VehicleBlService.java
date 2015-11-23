package Client.businesslogicservice.vehicleblservice;

import Client.VO.VehicleVO;

public interface VehicleBlService {
	
	//���ӳ���
	public void addVehicle(String carNum, String engineNum, String car, String baseNum, 
			String buyData, String useData, String carState);
	
	//���³���
	public void updateVehicle(String carNum, String engineNum, String car, String baseNum, 
			String buyData, String useData, String carState);
	
	//ɾ������
	public void deleteVehicle(String carNum);
	
	//���泵����Ϣ
	public void saveVehicle();
	
	//���ҳ�����Ϣ
	public VehicleVO find(String carNum);
	

}
