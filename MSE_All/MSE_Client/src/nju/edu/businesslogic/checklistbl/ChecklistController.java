package nju.edu.businesslogic.checklistbl;

import nju.edu.VO.*;
import nju.edu.businesslogicservice.checklistblservice.*;

public class ChecklistController implements ChecklistBlService{
	private OrderVO vo;
	@Override
	public OrderVO getOrder(String id) {
		Check check = new Check();
		vo = check.getOrder(id);
		return vo;
	}
	
	

}
