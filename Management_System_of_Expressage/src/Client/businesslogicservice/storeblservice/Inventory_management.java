package Client.businesslogicservice.storeblservice;

import java.util.ArrayList;

public interface Inventory_management {


	//�鿴ָ�������Ŀ����
	public ArrayList<String> checkInventory(int store_qu);
	
	//�鿴ָ���ֿ���ָ��ʱ����ڵĳ���������ͽ��
	public ArrayList<String> checkInventory(String startdata,String overdata);
	
	//�鿴ָ���ֿ��ָ��������ָ������������������Ʒ�Ķ�����Ϣ
	public void checkInventoryOrder(int store_number,int store_qu, String startdata,String overdata,String way);
	
	//���þ���ֵ
	public void setWarnData (int store_number, int warn_value);
	
	//��������ֵ
	public void setRemindData (int store_number, int remind_value);
}
