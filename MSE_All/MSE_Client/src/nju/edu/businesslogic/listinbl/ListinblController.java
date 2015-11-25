package nju.edu.businesslogic.listinbl;

import javax.swing.JTextArea;

import nju.edu.VO.OrderVO;
import nju.edu.businesslogicservice.listinblservice.ListinBLService;
import State.ExpressType;
import State.PackageType;

public class ListinblController implements ListinBLService{
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



}
