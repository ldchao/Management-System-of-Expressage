package nju.edu.businesslogicservice.listinblservice;

import nju.edu.VO.OrderVO;

import java.util.ArrayList;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import PO.OrderPO;
import State.ExpressType;
import State.PackageType;
import State.ResultMessage;

public interface ListinBLService {
	//�½�����
	public void addOrder(OrderVO vo);
	
	//��ȡ���صļ۸����
	public double getTotalMoney(String address1, String address2, String weight,String length, String width, String height, ExpressType express,
			PackageType pack);
	//�����ȡ�˴λ��˵�ʱ��
	public String getTotalTime(String address1,String address2,ExpressType express);
	
	//�ж϶�����Ϣ�Ƿ���ȫ
	public boolean JudgeNull(OrderVO vo);
	
}
