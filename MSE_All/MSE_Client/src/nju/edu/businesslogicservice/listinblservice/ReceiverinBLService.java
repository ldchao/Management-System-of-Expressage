package nju.edu.businesslogicservice.listinblservice;

import nju.edu.VO.ReceiverVO;
import State.ResultMessage;

public interface ReceiverinBLService {
	//�½��ռ�����Ϣ��
	public void addReceiver(ReceiverVO vo);
	
	public boolean searchOrder(String id);
	
	public void endAddReceiver();
}
