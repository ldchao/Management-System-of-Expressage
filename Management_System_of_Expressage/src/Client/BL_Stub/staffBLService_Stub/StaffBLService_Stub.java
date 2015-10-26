package Client.BL_Stub.staffBLService_Stub;

import java.util.ArrayList;

import Client.PO.StaffPO;
import Client.VO.StaffVO;
import Client.businesslogicservice.staffblservice.StaffBLService;

public class StaffBLService_Stub implements StaffBLService{
	String name;
	String address;
	String position;
	String phone;
	String cellphone;
	
	public StaffBLService_Stub(String name, String address, String position,
			String phone, String cellphone) {
		super();
		this.name = name;
		this.address = address;
		this.position = position;
		this.phone = phone;
		this.cellphone = cellphone;
	}

	public ArrayList<StaffVO> showStaff() {
		// TODO Auto-generated method stub
		ArrayList<StaffVO> StaffList=new ArrayList<StaffVO>();
		StaffList.add(new StaffVO(name,address,position,phone,cellphone));
		return StaffList;
	}

	public StaffVO checkStaff(String name) {
		// TODO Auto-generated method stub
		if(name.equals("小米")){
			return new StaffVO(name,address,position,phone,cellphone);
		}else{
			System.out.println("no exist");
			return null;
		}
	}

	public void addStaff(String name, String addsress, String position,
			String phone, String cellphone) {
		// TODO Auto-generated method stub
		System.out.println("add succeed");
	}

	public StaffVO searchStaff(String name) {
		// TODO Auto-generated method stub
		if(name.equals("小米")){
			return new StaffVO(name,address,position,phone,cellphone);
		}else{
			System.out.println("no exist");
			return null;
		}
	}

	public void editStaff(String name,String address,String position,
	String phone,String cellphone) {
		// TODO Auto-generated method stub
		System.out.println("edit succeed");
	}

	public void deleteStaff(String name) {
		// TODO Auto-generated method stub
		System.out.println("delete succeed");
	}

	public void endStaff() {
		// TODO Auto-generated method stub
		System.out.println("end the staff");
	}

}
