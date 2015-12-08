package nju.edu.businesslogicservice.vehicleblservice;

import nju.edu.VO.VehicleVO;

public interface VehicleBlService {
	
	//���ӳ���
	public void addVehicle(VehicleVO vo);
	
	//���³���
	public void updateVehicle(VehicleVO vo);
	
	//ɾ������
	public void deleteVehicle(String carNum);
	
	//��ѯ�Ƿ����
	public boolean searchVehicle(String carNum);
	
	//���ҳ�����Ϣ
	public VehicleVO find(String carNum);
	
	
	

}
