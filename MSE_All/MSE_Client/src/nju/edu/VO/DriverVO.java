package nju.edu.VO;

import java.io.Serializable;

public class DriverVO implements Serializable {
	String driverNum;
	String name;
	String shopNum;
	String birthDate;
	String idNum;
	String phoneNum; 
	String sex;
	String licenseDue;
	String driverState;

	public DriverVO(String driverNum,String name,String shopNum,String birthDate,
	String idNum,String phoneNum,String sex,String licenseDue,String driverState){
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
        返回司机编号
	    return String
    */
	public String getDriverNum(){
		return driverNum;
	}

	/*  getName
        返回司机姓名
	    return String
    */
	public String getName(){
		return name;
	}
	
	/*  getShopNum
        返回营业厅编号
	    return String
    */
	public String getShopNum(){
		return shopNum;
	}

	/*  getBirthDate
        返回出生日期
	    return String
    */
	public String getBirthDate(){
		return birthDate;
	}

	/*  getIdNum
        返回身份证号
	    return String
    */
	public String getIdNum(){
		return idNum;
	}

	/*  getPhoneNum
        返回手机号码
	    return String
    */
	public String getPhoneNum(){
		return phoneNum;
	}

	/*  getSex
        返回性别
	    return String
    */
	public String getSex(){
		return sex;
	}

	/*  getLicenseDue
        返回行驶证期限
	    return String
    */
	public String getLicenseDue(){
		return licenseDue;
	}

	/*  getDriverState
        返回司机状态
	    return String
    */
	public String getDriverState(){
		return driverState;
	}
	
	/*  setDriverState
        设置司机状态
        void
    */
	
	public void setDriverState() {
		this.driverState = driverState;
}
}