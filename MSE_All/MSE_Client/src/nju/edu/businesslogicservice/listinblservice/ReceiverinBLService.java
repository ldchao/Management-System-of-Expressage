package nju.edu.businesslogicservice.listinblservice;

import nju.edu.VO.ReceiverVO;
import State.ResultMessage;

public interface ReceiverinBLService {
	//�½��ռ�����Ϣ��
	public void addReceiver(ReceiverVO vo);
	
	//�����Ƿ���ڴ˶���
	public boolean searchOrder(String id);
	
	//�ж���Ϣ�Ƿ���ȫ
	public boolean JudgeNull(ReceiverVO vo);
}
