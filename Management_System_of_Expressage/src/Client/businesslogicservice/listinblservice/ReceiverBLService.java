package Client.businesslogicservice.listinblservice;

public interface ReceiverBLService {
	//新建收件人信息单
	public void addReceiver(String courier, String phoneOfcourier, String id,
			String receiver, String address, String time, String cellphone);
	
	public void endAddReceiver();
}
