package nju.edu.businesslogicservice.staffblservice;

import java.util.ArrayList;

import PO.StaffPO;

public interface editStaffInfo {
	//�޸��û���,ǰһ��Ϊ���û�������һ��Ϊ���û���
	public void editTheID(String oldID,String newID,String position);
	
	//��ȡ����û�л���û�������Ա��po��arrayList,���û�У�����һ���յ�arraylist<StaffPO>
	public ArrayList<StaffPO> getAllStaff();
	
	//��Ա����û����������ֱ�����Ա�µ��û�����Ȩ�޺�Ҫ���ĵ���Ա��po
	public void staffGetID(String id,String rank,StaffPO po);
	
	//����Աɾ���û���ʱ���ܾ�����߻�ɾ����Ա,�������û���
	public void deleteStaff(String id);
}
