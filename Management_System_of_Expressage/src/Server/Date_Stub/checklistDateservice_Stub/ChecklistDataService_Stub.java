package Server.Date_Stub.checklistDateservice_Stub;

import Client.PO.OrderPO;
import Client.dataservice.checklistdataservice.ListinDataService;
import Server.dataservice.checklistdataservice.*;

public class ChecklistDataService_Stub implements ListinDataService{

	@Override
	public OrderPO find(String id) {
		System.out.println("已找到！");		
		OrderPO po = new OrderPO("张三", "141250089", 1, "李四", "南京", "北京", "1333333333", 
				"li", "an", "tu", "zui", "shuai", 
				"en", "4", 2, 2, 2,
				2, "书包", 3, 2, 3.0, "10-30", "已到达南京");
		return po;
	}

}
