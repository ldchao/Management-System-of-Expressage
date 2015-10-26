package Client.BL_Stub.checklistBLService_Stub;

import Client.VO.OrderVO;
import Client.businesslogicservice.checklistblservice.*;

public class ChecklistBlService_Stub implements ChecklistBlService{
	
	//���Ա�Ͷ����ź͵�������״̬
		String courier;
		String id;
		int state;
		
		//�ļ�����Ϣ
		String sender;
		String address1;
		String position1;
		String phone1;
		String cellphone1;
		
		//�ռ�����Ϣ
		String receiver;
		String address2;
		String position2;
		String phone2;
		String cellphone2;
		
		//�ļ���Ϣ
		String count;
		int weight;
		int length;
		int width;
		int height;
		String items;
		
		//�������
		int express;
		
		//��װ����
		int pack;
		
		//�����Ԥ��ʱ��
		double bill;
		String time;

		//������Ϣ
		String transformState;
		
		

	public ChecklistBlService_Stub(String courier, String id, int state, String sender, String address1,
				String position1, String phone1, String cellphone1, String receiver, String address2, String position2,
				String phone2, String cellphone2, String count, int weight, int length, int width, int height,
				String items, int express, int pack, double bill, String time, String transformState) {
			super();
			this.courier = courier;
			this.id = id;
			this.state = state;
			this.sender = sender;
			this.address1 = address1;
			this.position1 = position1;
			this.phone1 = phone1;
			this.cellphone1 = cellphone1;
			this.receiver = receiver;
			this.address2 = address2;
			this.position2 = position2;
			this.phone2 = phone2;
			this.cellphone2 = cellphone2;
			this.count = count;
			this.weight = weight;
			this.length = length;
			this.width = width;
			this.height = height;
			this.items = items;
			this.express = express;
			this.pack = pack;
			this.bill = bill;
			this.time = time;
			this.transformState = transformState;
		}



	@Override
	public OrderVO getOrder(String id) {
		return new OrderVO(courier,id , state, sender,
				address1, position1, phone1,
				cellphone1, receiver, address2,
				position2,phone2, cellphone2, count,
				weight, length, width, height, items,
				express, pack, bill, time,
				transformState);
	}
     
}
