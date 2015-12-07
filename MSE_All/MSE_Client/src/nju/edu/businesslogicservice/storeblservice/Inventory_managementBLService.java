package nju.edu.businesslogicservice.storeblservice;

import java.util.ArrayList;

import nju.edu.VO.StoreinVO;

public interface Inventory_managementBLService {

	// �鿴ָ���ֿ���ָ��ʱ����ڵĳ���������ͽ��
	public String[][] checkInventory(String startdate, String overdate);

	// �鿴ָ���ֿ��ָ������ǰ���п�����Ʒ�Ķ�����Ϣ
	public String[][] checkInventoryOrder(String qu);
	
	//��ָ���ֿ��ָ������ǰ���п�����Ʒ�Ķ�����Ϣ�����excel��
	public void InventoryOrderToExcel(String qu);

	// �õ���ǰ����ֵ
	public String getWarnData();

	// ���þ���ֵ
	public void setWarnData(String warnData);

	// �õ�ָ�����������ֵ
	public String getRemindData(int area);

	// ����ָ�����������ֵ
	public void setRemindData(int area, String RemindData);

	// ��������õ����ж�����
	public ArrayList<String> getOrderList(String qu);
}
