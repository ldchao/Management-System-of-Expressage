package nju.edu.businesslogicservice.listinblservice;

import nju.edu.VO.OrderVO;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import State.ExpressType;
import State.PackageType;
import State.ResultMessage;

public interface ListinBLService {
	//ÐÂ½¨¶©µ¥
	public void addOrder(OrderVO vo);
	
	public double getTotalMoney(String address1, String address2, String text, String text2, String text3, ExpressType express,
			PackageType pack);
	
	public String getTotalTime(String address1,String address2,ExpressType express);

}
