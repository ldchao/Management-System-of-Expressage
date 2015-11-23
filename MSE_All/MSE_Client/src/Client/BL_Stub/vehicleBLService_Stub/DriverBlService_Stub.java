package Client.BL_Stub.vehicleBLService_Stub;

import Client.VO.DriverVO;
import Client.businesslogicservice.vehicleblservice.*;

public class DriverBlService_Stub implements DriverBlService{
	
	String driverNum;
	String name;
	String shopNum;
	String birthDate;
	String idNum;
	String phoneNum; 
	String sex;
	String licenseDue;
	String driverState;
	
	

	public DriverBlService_Stub(String driverNum, String name, String shopNum, String birthDate, String idNum,
			String phoneNum, String sex, String licenseDue, String driverState) {
		super();
		this.driverNum = driverNum;
		this.name = name;
		this.shopNum = shopNum;
		this.birthDate = birthDate;
		this.idNum = idNum;
		this.phoneNum = phoneNum;
		this.sex = sex;
		this.licenseDue = licenseDue;
		this.driverState = driverState;
	}

	@Override
	public void addDriver(String driverNum, String name, String shopNum, String birthdata, String idNum,
			String phoneNum, String sex, String licenseDue, String driverState) {
		System.out.println("新建一个司机信息！");
		
	}

	@Override
	public void updateDriver(String driverNum, String name, String shopNum, String birthdata, String idNum,
			String phoneNum, String sex, String licenseDue, String driverState) {
		System.out.println("更新一个司机信息！");
		
	}

	@Override
	public void deleteDriver(String name) {
		System.out.println("删除一个司机信息！");
		
	}

	@Override
	public void saveDriver() {
		System.out.println("保存一个司机信息！");
		
	}

	@Override
	public DriverVO find(String name) {
		// TODO Auto-generated method stub
		return new DriverVO(driverNum,name,shopNum,birthDate,idNum,
          phoneNum, sex,licenseDue,driverState);
	}

}
