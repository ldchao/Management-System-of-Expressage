package nju.edu.businesslogicservice.staffblservice;

import java.util.ArrayList;

import nju.edu.VO.StaffVO;


public interface StaffBLService {
	//显示人员名单列表
	public ArrayList<StaffVO> showStaff();
	
	//显示人员具体信息
	public StaffVO checkStaff(String name);
	
	public void addStaff(StaffVO vo);
	
	public void editStaff(StaffVO vo);
	
	public void deleteStaff(String id);

	
}
