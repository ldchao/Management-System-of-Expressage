package nju.edu.businesslogicservice.staffblservice;

import java.util.ArrayList;

import nju.edu.VO.StaffVO;


public interface StaffBLService {
	//��ʾ��Ա�����б�
	public ArrayList<StaffVO> showStaff();
	
	//��ʾ��Ա������Ϣ
	public StaffVO checkStaff(String name);
	
	//������Ա
	public void addStaff(StaffVO vo);
	
	//�޸���Ա��Ϣ
	public void editStaff(StaffVO vo);
	
	//ɾ��һ����Ա
	public void deleteStaff(String id);

	
}
