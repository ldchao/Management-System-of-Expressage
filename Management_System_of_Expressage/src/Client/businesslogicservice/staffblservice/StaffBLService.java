package Client.businesslogicservice.staffblservice;

import java.util.ArrayList;

import Client.PO.StaffPO;
import Client.VO.StaffVO;


public interface StaffBLService {
	//显示人员名单列表
	public ArrayList<StaffVO> showStaff();
	
	//显示人员具体信息
	public StaffVO checkStaff(String name);
	
	public void addStaff(String name,String address,String position,String phone,String cellphone);
	
	//查询是否存在这个人员信息，如果有，就返回
	public StaffVO searchStaff(String name);
	
	public void editStaff(String name,String address,String position,
	String phone,String cellphone);
	
	public void deleteStaff(String name);
	
	public void endStaff();
}
