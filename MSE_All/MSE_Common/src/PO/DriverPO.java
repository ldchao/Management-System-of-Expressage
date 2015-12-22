package PO;
import java.io.Serializable;

import State.DriverState;

public class DriverPO implements Serializable{
	String driverNum;
	String name;
	String shopNum;
	String birthDate;
	String idNum;
	String phoneNum; 
	String sex;
	String licenseDue;
	DriverState driverState;

	public DriverPO(String driverNum,String name,String shopNum,String birthDate,
	String idNum,String phoneNum,String sex,String licenseDue,DriverState driverState){
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

 
	public String getDriverNum(){
		return driverNum;
	}


	public String getName(){
		return name;
	}

	public String getShopNum(){
		return shopNum;
	}


	public String getBirthDate(){
		return birthDate;
	}

	public String getIdNum(){
		return idNum;
	}

	
	public String getPhoneNum(){
		return phoneNum;
	}


	public String getSex(){
		return sex;
	}


	public String getLicenseDue(){
		return licenseDue;
	}


	public DriverState getDriverState(){
		return driverState;
	}
	

	public void setDriverState(DriverState driverState) {
		this.driverState = driverState;
	}








}
