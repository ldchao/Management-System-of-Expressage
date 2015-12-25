
package nju.edu.businesslogic.staffbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.StaffPO;
import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.StaffVO;
import nju.edu.businesslogic.loginbl.checkStaffInfo;
import nju.edu.businesslogicservice.staffblservice.DeleteUserInterface;
import nju.edu.businesslogicservice.staffblservice.StaffBLService;
import nju.edu.businesslogicservice.staffblservice.editStaffInfo;
import nju.edu.dataservice.staffdataservice.StaffDataService;

public class Staffbl implements StaffBLService,checkStaffInfo,editStaffInfo{
	StaffDataService staffDataService=RMIHelper.getStaffData();
	@Override
	public ArrayList<StaffVO> showStaff() {
		// TODO Auto-generated method stub
		ArrayList<StaffPO> staffPOs=null;
		try {
			staffPOs=staffDataService.gets();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<StaffVO> staffVOs=new ArrayList<StaffVO>();
		for(int i=0;i<staffPOs.size();i++){
			StaffPO po=staffPOs.get(i);
			StaffVO staffVO=new StaffVO(po.getId(), po.getName(), po.getAddress(), po.getPosition(), po.getPhone(), po.getCellphone(), po.getShop());
			staffVOs.add(staffVO);
		}
		return staffVOs;
	}

	//根据用户名获得StaffPO
	@Override
	public StaffVO checkStaff(String name) {
		// TODO Auto-generated method stub
		StaffPO po=null;
		try {
			po=staffDataService.get(name);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(po==null)
			return null;
		else{
			StaffVO vo=new StaffVO(po.getId(), po.getName(), po.getAddress(),
					po.getPosition(), po.getPhone(), po.getCellphone(), po.getShop());
			return vo;
		}


	}

	@Override
	public void addStaff(StaffVO vo) {
		// TODO Auto-generated method stub
		StaffPO po=new StaffPO(vo.getId(), vo.getName(), vo.getAddress(), vo.getPosition(), vo.getPhone(), vo.getCellphone(), vo.getShop());
		try {
			staffDataService.insert(po);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void editStaff(StaffVO vo) {
		// TODO Auto-generated method stub
		StaffPO po=new StaffPO(vo.getId(), vo.getName(), vo.getAddress(), vo.getPosition(), vo.getPhone(), vo.getCellphone(), vo.getShop());
		try {
			staffDataService.update(po);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteStaff(String id) {
		// TODO Auto-generated method stub
		try {
			staffDataService.delete(id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		String []temp=staffPO.getShop().split(",");
		staffPO.setShop(temp[0]+temp[1]);
		return staffPO;
	}

	public boolean JudgeNull(StaffVO vo) {
		// TODO Auto-generated method stub
		boolean result=false;
		if(vo.getId().equals("")||vo.getName().equals("")||vo.getAddress().equals("")||vo.getPosition().equals("")
				||vo.getPhone().equals("")||vo.getCellphone().equals("")||vo.getShop().equals(""))
			result=true;
		return result;
	}
	
	
	@Override
	public void editTheID(String oldID, String newID,String position) {
		// TODO Auto-generated method stub
		try {
			staffDataService.editTheID(oldID, newID, position);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getnum() {
		// TODO Auto-generated method stub
		String result="";
		try {
			result = ""+staffDataService.getnum();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public ArrayList<StaffPO> getAllStaff() {
		// TODO Auto-generated method stub
		ArrayList<StaffPO> arrayList=null;
		try {
			arrayList=staffDataService.getAllStaff();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arrayList;
	}

	@Override
	public void staffGetID(String id, String rank, StaffPO po) {
		// TODO Auto-generated method stub
		po.setPosition(rank);
		try {
			staffDataService.exchange(id,po);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
