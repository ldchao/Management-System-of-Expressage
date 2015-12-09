package nju.edu.businesslogicservice.loadblservice;

import nju.edu.VO.VehicleLoadorderVO;

public interface LoadBlService {
	
	//新建装车单
	public void addLoadOrder(VehicleLoadorderVO vlv);
	
	//获得运费总价
	public double getTotal(String arrival);
	

}
