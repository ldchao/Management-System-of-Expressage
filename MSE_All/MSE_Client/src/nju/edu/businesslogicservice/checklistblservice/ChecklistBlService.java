package nju.edu.businesslogicservice.checklistblservice;

import nju.edu.VO.OrderVO;

public interface ChecklistBlService {
	
	//得到所查询的订单
	public OrderVO getOrder(String id);

}
