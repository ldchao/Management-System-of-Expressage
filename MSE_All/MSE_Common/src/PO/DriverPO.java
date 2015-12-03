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

    /*  getDriverNum
        杩斿洖鍙告満缂栧彿
	    return String
    */
	public String getDriverNum(){
		return driverNum;
	}

	/*  getName
        杩斿洖鍙告満濮撳悕
	    return String
    */
	public String getName(){
		return name;
	}
	
	/*  getShopNum
        杩斿洖钀ヤ笟鍘呯紪鍙�
	    return String
    */
	public String getShopNum(){
		return shopNum;
	}

	/*  getBirthDate
        杩斿洖鍑虹敓鏃ユ湡
	    return String
    */
	public String getBirthDate(){
		return birthDate;
	}

	/*  getIdNum
        杩斿洖韬唤璇佸彿
	    return String
    */
	public String getIdNum(){
		return idNum;
	}

	/*  getPhoneNum
        杩斿洖鎵嬫満鍙风爜
	    return String
    */
	public String getPhoneNum(){
		return phoneNum;
	}

	/*  getSex
        杩斿洖鎬у埆
	    return String
    */
	public String getSex(){
		return sex;
	}

	/*  getLicenseDue
        杩斿洖琛岄┒璇佹湡闄�
	    return String
    */
	public String getLicenseDue(){
		return licenseDue;
	}

	/*  getDriverState
        杩斿洖鍙告満鐘舵��
	    return String
    */
	public DriverState getDriverState(){
		return driverState;
	}
	
	/*  setDriverState
        璁剧疆鍙告満鐘舵��
        void
    */
	
	public void setDriverState() {
		this.driverState = driverState;
	}








}
