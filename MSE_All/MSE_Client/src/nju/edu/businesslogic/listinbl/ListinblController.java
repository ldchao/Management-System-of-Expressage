package nju.edu.businesslogic.listinbl;

import javax.swing.JTextArea;

import nju.edu.VO.OrderVO;
import nju.edu.businesslogic.checklistbl.ListinInfo;
import nju.edu.businesslogicservice.listinblservice.ListinBLService;
import nju.edu.businesslogicservice.listinblservice.OrderInfo;
import nju.edu.businesslogicservice.listinblservice.UpdateInfo;
import State.ExpressType;
import State.PackageType;

public class ListinblController implements ListinBLService,ListinInfo,OrderInfo,UpdateInfo{
	Listinbl Listinbl=new Listinbl();
	@Override
	public void addOrder(OrderVO vo) {
		// TODO Auto-generated method stub
		Listinbl.addOrder(vo);
	}

	@Override
	public double getTotalMoney(String address1, String address2, String text, String text2, String text3, ExpressType express,
			PackageType pack) {
		// TODO Auto-generated method stub
		if(express==ExpressType.Economy)
			return 5;
		else {
			return 10;
		}
	}

	@Override
	public String getTotalTime(String address1, String address2, ExpressType express) {
		// TODO Auto-generated method stub
		return address1+address2;
	}

	@Override
	public void update(String id, String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getWeight(String id) {
		return 0;
		// TODO Auto-generated method stub
		
	}

	@Override
	public OrderVO getOrder(String id) {
		// TODO Auto-generated method stub
		return null;
	}





}
