package nju.edu.businesslogicservice.staffblservice;

import java.util.ArrayList;

import nju.edu.VO.StaffVO;


public interface StaffBLService {
	//��ʾ��Ա�����б�
	public ArrayList<StaffVO> showStaff();
	
	//��ʾ��Ա������Ϣ
	public StaffVO checkStaff(String name);
	
	public void addStaff(StaffVO vo);
	
	public void editStaff(StaffVO vo);
	
	public void deleteStaff(String id);

	
}
