package nju.edu.businesslogicservice.loadblservice;

import nju.edu.VO.VehicleLoadorderVO;

public interface LoadBlService {
	
	//�½�װ����
	public void addLoadOrder(VehicleLoadorderVO vlv);
	
	//����˷��ܼ�
	public double getTotal(String arrival);
	

}
