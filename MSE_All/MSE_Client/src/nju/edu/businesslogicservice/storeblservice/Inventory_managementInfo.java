package nju.edu.businesslogicservice.storeblservice;

import java.util.ArrayList;

public interface Inventory_managementInfo {

	//�õ���ǰ����ֵ
	public String getWarnData();
	
	//���þ���ֵ
	public void setWarnData(String warnData);
	
	//�õ�ָ�����������ֵ
	public String getRemindData(int area);
	
	//����ָ�����������ֵ
	public void setRemindData(int area,String RemindData);
	
	//��������õ����ж�����
	public ArrayList<String> getOrderList(String qu);
}
