package nju.edu.businesslogic.checklistbl;
import nju.edu.VO.OrderVO;
import nju.edu.businesslogic.listinbl.Listinbl;

public class Check {
	private ListinInfo listin;
	private OrderVO vo;
	
	
	public OrderVO getOrder(String id){
		listin = new Listinbl();
		vo = listin.getOrder(id);
		return vo;
	}

}
