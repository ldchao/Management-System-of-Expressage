package Client.businesslogicservice.transferblservice;

import Client.PO.SendorderPO;

import java.util.ArrayList;

public interface SendFormBlService {
    //新建派件单
	public void addReceiveOrder(String data, ArrayList<String> orderNum, String sender);
	
	//保存派件单
	public void endSend();
	
	//导出
	public void exportSendOrder(SendorderPO po);
}
