package Client.businesslogicservice.listinblservice;

import State.ResultMessage;

public interface ReceiverinBLService {
	//�½��ռ�����Ϣ��
	public void addReceiver(String courier, String phoneOfcourier, String id,
			String receiver, String address, String time, String cellphone);
	
	public void endAddReceiver();
}
