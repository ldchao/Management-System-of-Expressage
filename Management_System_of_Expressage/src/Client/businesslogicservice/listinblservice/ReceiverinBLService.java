package Client.businesslogicservice.listinblservice;

import State.ResultMessage;

public interface ReceiverinBLService {
	//新建收件人信息单
	public ResultMessage addReceiver(String courier, String phoneOfcourier, String id,
			String receiver, String address, String time, String cellphone);
	
	public void endAddReceiver();
}
