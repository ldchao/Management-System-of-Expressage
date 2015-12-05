
package nju.edu.businesslogic.staffbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.StaffPO;
import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.StaffVO;
import nju.edu.businesslogic.loginbl.checkStaffInfo;
import nju.edu.businesslogicservice.staffblservice.StaffBLService;
import nju.edu.dataservice.staffdataservice.StaffDataService;

public class Staffbl implements StaffBLService,checkStaffInfo{

	@Override
	public ArrayList<StaffVO> showStaff() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StaffVO checkStaff(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addStaff(String name, String address, String position, String phone, String cellphone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public StaffVO searchStaff(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editStaff(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStaff(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endStaff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public StaffPO getStaffPO(String name) {
		// TODO Auto-generated method stub
		StaffDataService staffDataService=RMIHelper.getStaffData();
		StaffPO staffPO=null;
		try {
			staffPO=staffDataService.get(name);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return staffPO;
	}

}
