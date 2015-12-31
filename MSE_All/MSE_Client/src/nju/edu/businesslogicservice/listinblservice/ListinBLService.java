package nju.edu.businesslogicservice.listinblservice;

import nju.edu.VO.OrderVO;

import java.util.ArrayList;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import PO.OrderPO;
import State.ExpressType;
import State.PackageType;
import State.ResultMessage;

public interface ListinBLService {
	//新建订单
	public void addOrder(OrderVO vo);
	
	//获取两地的价格策略
	public double getTotalMoney(String address1, String address2, String weight,String length, String width, String height, ExpressType express,
			PackageType pack);
	//计算获取此次货运的时间
	public String getTotalTime(String address1,String address2,ExpressType express);
	
	//判断订单信息是否齐全
	public boolean JudgeNull(OrderVO vo);
	
}
