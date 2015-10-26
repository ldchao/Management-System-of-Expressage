package Server.Date_Stub.staffDateservice_Stub;

import java.util.ArrayList;

import Client.PO.StaffPO;
import Server.dataservice.staffdataservice.StaffDataService;

public class StaffDateService_Stub implements StaffDataService{
	//人员信息
	String name;
	String address;
	String position;
	String phone;
	String cellphone;
	
	
	public StaffDateService_Stub(String name, String address, String position,
			String phone, String cellphone) {
		super();
		this.name = name;
		this.address = address;
		this.position = position;
		this.phone = phone;
		this.cellphone = cellphone;
	}

	public ArrayList<StaffPO> gets() {
		// TODO Auto-generated method stub
		ArrayList<StaffPO> staffList=new ArrayList<StaffPO>();
		staffList.add(new StaffPO(name,address,position,phone,cellphone));
		return staffList;
	}

	public StaffPO get(String name) {
		// TODO Auto-generated method stub
		if(name.equals("小米")){
			return new StaffPO(name,address,position,phone,cellphone);
		}else{
			return null;
		}
	}

	public void insert(StaffPO po) {
		// TODO Auto-generated method stub
		System.out.println("insert succeed");
	}

	public void delete(StaffPO po) {
		// TODO Auto-generated method stub
		System.out.println("delete succeed");
	}

	public void update(StaffPO po) {
		// TODO Auto-generated method stub
		System.out.println("update succeed");
	}
	
}
