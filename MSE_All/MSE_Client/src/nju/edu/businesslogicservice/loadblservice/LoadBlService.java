package nju.edu.businesslogicservice.loadblservice;

import java.rmi.RemoteException;

import nju.edu.VO.VehicleLoadorderVO;
import PO.LoadorderPO;
import PO.send_LoadorderPO;

public interface LoadBlService {
	
	//�½�װ����
	public void addLoadOrder(VehicleLoadorderVO vlv);
	
	//����˷��ܼ�
	public double getTotal(String arrival);
	

}
