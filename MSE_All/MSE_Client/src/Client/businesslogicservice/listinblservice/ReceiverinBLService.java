package Client.businesslogicservice.listinblservice;

import Client.VO.ReceiverVO;
import State.ResultMessage;

public interface ReceiverinBLService {
	//�½��ռ�����Ϣ��
	public void addReceiver(ReceiverVO vo);
	
	public void endAddReceiver();
}
