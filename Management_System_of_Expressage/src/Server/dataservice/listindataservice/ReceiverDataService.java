package Server.dataservice.listindataservice;

import Client.PO.ReceiverPO;
import State.ResultMessage;

public interface ReceiverDataService {
	public void insertReceiver(ReceiverPO po);
	
	public ResultMessage find(String number);
}
