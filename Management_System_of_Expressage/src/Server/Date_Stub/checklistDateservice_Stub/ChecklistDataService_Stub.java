package Server.Date_Stub.checklistDateservice_Stub;

import Client.PO.OrderPO;
import Client.dataservice.checklistdataservice.ListinDataService;
import Server.dataservice.checklistdataservice.*;

public class ChecklistDataService_Stub implements ListinDataService{

	@Override
	public OrderPO find(String id) {
		System.out.println("���ҵ���");		
		OrderPO po = new OrderPO("����", "141250089", 1, "����", "�Ͼ�", "����", "1333333333", 
				"li", "an", "tu", "zui", "shuai", 
				"en", "4", 2, 2, 2,
				2, "���", 3, 2, 3.0, "10-30", "�ѵ����Ͼ�");
		return po;
	}

}
