package nju.edu.businesslogicservice.staffblservice;

import java.util.ArrayList;

import PO.StaffPO;

public interface editStaffInfo {
	//修改用户名,前一个为旧用户名，后一个为新用户名
	public void editTheID(String oldID,String newID,String position);
	
	//获取所有没有获得用户名的人员的po的arrayList,如果没有，返回一个空的arraylist<StaffPO>
	public ArrayList<StaffPO> getAllStaff();
	
	//人员获得用户名，参数分别是人员新的用户名，权限和要更改的人员的po
	public void staffGetID(String id,String rank,StaffPO po);
	
	//管理员删除用户名时，总经理这边会删除人员,参数是用户名
	public void deleteStaff(String id);
}
