package Client.businesslogicservice.transferblservice;

import Client.PO.ReceiveorderPO;

import java.util.ArrayList;

public interface ReceiFormBlService {
    //新建接收单
	public void addReceiveOrder(String data, String changeOrderNum, String departPlace,
			String arriveState, ArrayList<String> orderNum, String name);
	
	//保存接收单
	public void endRecei();
	
	//导出
	public void exportReceiOrder(ReceiveorderPO po);
}
