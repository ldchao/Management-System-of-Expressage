package nju.edu.businesslogic.storebl;

import java.util.ArrayList;

import nju.edu.VO.OrderInStoreVO;
import nju.edu.businesslogicservice.storeblservice.Inventory_managementBLService;

public class Inventory_managementBL implements Inventory_managementBLService{

	int store_num;
	

	//�鿴ָ���ֿ���ָ��ʱ����ڵĳ���������ͽ��
	@Override
	public ArrayList<String> checkInventory(String startdata, String overdata) {
		// TODO Auto-generated method stub
		ArrayList<String> inventory_num=new ArrayList<String>();
		return inventory_num;
	}

	//�鿴ָ���ֿ��ָ��������ָ������������������Ʒ�Ķ�����Ϣ
	@Override
	public ArrayList<OrderInStoreVO> checkInventoryOrder(int store_number, int store_qu,
			String startdata, String overdata, String way) {
		// TODO Auto-generated method stub
		ArrayList<OrderInStoreVO> inventory_order=new ArrayList<OrderInStoreVO>();
		return inventory_order;
	}

	//���þ���ֵ
	@Override
	public void setWarnData(int store_number, int warn_value) {
		// TODO Auto-generated method stub
		System.out.println("���þ���ֵ");
	}

	//��������ֵ
	@Override
	public void setRemindData(int store_number, int remind_value) {
		// TODO Auto-generated method stub
		System.out.println("��������ֵ");
	}

}
