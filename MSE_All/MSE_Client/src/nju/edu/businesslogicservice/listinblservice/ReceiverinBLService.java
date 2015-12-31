package nju.edu.businesslogicservice.listinblservice;

import nju.edu.VO.ReceiverVO;
import State.ResultMessage;

public interface ReceiverinBLService {
	//新建收件人信息单
	public void addReceiver(ReceiverVO vo);
	
	//查找是否存在此订单
	public boolean searchOrder(String id);
	
	//判断信息是否齐全
	public boolean JudgeNull(ReceiverVO vo);
}
