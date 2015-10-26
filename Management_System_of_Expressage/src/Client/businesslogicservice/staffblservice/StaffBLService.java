package Client.businesslogicservice.staffblservice;

import java.util.ArrayList;

import Client.PO.StaffPO;
import Client.VO.StaffVO;


public interface StaffBLService {
	//��ʾ��Ա�����б�
	public ArrayList<StaffVO> showStaff();
	
	//��ʾ��Ա������Ϣ
	public StaffVO checkStaff(String name);
	
	public void addStaff(String name,String address,String position,String phone,String cellphone);
	
	//��ѯ�Ƿ���������Ա��Ϣ������У��ͷ���
	public StaffVO searchStaff(String name);
	
	public void editStaff(String name,String address,String position,
	String phone,String cellphone);
	
	public void deleteStaff(String name);
	
	public void endStaff();
}
