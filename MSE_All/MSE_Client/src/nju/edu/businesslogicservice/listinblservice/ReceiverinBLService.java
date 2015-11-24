package nju.edu.businesslogicservice.listinblservice;

import nju.edu.VO.ReceiverVO;
import State.ResultMessage;

public interface ReceiverinBLService {
	//新建收件人信息单
	public void addReceiver(ReceiverVO vo);
	
	public boolean searchOrder(String id);
	
	public void endAddReceiver();
}
