package nju.edu.businesslogic.staffbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.StaffPO;
import PO.UserPO;
import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.UserVO;
import nju.edu.businesslogic.loginbl.checkUserInfo;
import nju.edu.businesslogicservice.loginblservice.UpdatePasswordService;
import nju.edu.businesslogicservice.staffblservice.DeleteUserInterface;
import nju.edu.businesslogicservice.staffblservice.UserBLService;
import nju.edu.businesslogicservice.staffblservice.editStaffInfo;
import nju.edu.dataservice.staffdataservice.UserDataService;
import nju.edu.presentation.general_managerui.editStaff;

public class UserBL implements UserBLService, checkUserInfo,
		DeleteUserInterface, UpdatePasswordService {

	UserDataService userData = RMIHelper.getUserData();
	editStaffInfo editstaff = new Staffbl();

	@Override
	public boolean addUser(String name, String key, String limit) {

		UserPO userPO = new UserPO(name, key, limit);

		boolean isin = false;
		ArrayList<UserVO> userlist = checkUsers();
		for (UserVO vo : userlist) {
			if (vo.getName().equals(name)) {
				isin = true;
				break;
			}
		}

		if (!isin) {
			try {
				userData.insert(userPO);
			} catch (RemoteException e) {
				e.printStackTrace();
			}
			return true;
		} else {
			return false;
		}
	}

	@Override
	public ArrayList<UserVO> updateUser(int pos, String oldname, String name,
			String limit) {

		ArrayList<UserVO> list = new ArrayList<UserVO>();
		UserPO userpo = new UserPO(name, "0", limit);
		try {
			ArrayList<UserPO> userPOs = userData.update(pos, userpo);
			for (UserPO po : userPOs) {
				UserVO usv = new UserVO(po.getName(), po.getKey(),
						po.getLimit());
				list.add(usv);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		editstaff.editTheID(oldname, name, limit);

		return list;
	}

	@Override
	public void deleteUser(String name) {

		try {
			userData.delete(name);
			editstaff.deleteStaff(name);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	@Override
	public UserVO checkUser(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<UserVO> checkUsers() {
		ArrayList<UserVO> userlist = new ArrayList<>();

		try {
			ArrayList<UserPO> userPOs = userData.finds();
			for (UserPO po : userPOs) {
				UserVO usv = new UserVO(po.getName(), po.getKey(),
						po.getLimit());
				userlist.add(usv);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return userlist;
	}

	@Override
	public void UpdatePassword(String User, String newKey) {

		try {
			userData.UpdatePassword(User, newKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<StaffPO> IDfromeManager() {

		ArrayList<StaffPO> stafflist = editstaff.getAllStaff();

		return stafflist;
	}

	public void IDtoManager(String newID, String newlimit, StaffPO po) {

		editstaff.staffGetID(newID, newlimit, po);
	}
}
