package nju.edu.businesslogicservice.staffblservice;

import java.util.ArrayList;

import nju.edu.VO.StaffVO;


public interface StaffBLService {
	//显示人员名单列表
	public ArrayList<StaffVO> showStaff();
	
	//显示人员具体信息
	public StaffVO checkStaff(String name);
	
	//新增人员
	public void addStaff(StaffVO vo);
	
	//修改人员信息
	public void editStaff(StaffVO vo);
	
	//删除一个人员
	public void deleteStaff(String id);

	
}
