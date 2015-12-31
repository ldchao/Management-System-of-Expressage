package nju.edu.businesslogicservice.staffblservice;

public interface DeleteUserInterface {
	//删除人员的同时删除其占有的用户名
	public void deleteUser(String name);
}
