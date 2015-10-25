import java.io.Serializable;

public class DriverPO implements Serializable{
	String driverNum;
	String name;
	String shopNum;
	String birthDate;
	String idNum;
	String phoneNum; 
	String sex;
	String licenseDue;
	String driverState;

	public DriverPO(String driverNum,String name,String shopNum,String birthDate,
	String idNum,String phoneNum,String sex,String licenseDue,String driverState){
		driverNum = this.driverNum;
		name = this.name;
		shopNum = this.shopNum;
		birthDate = this.birthDate;
		idNum = this.idNum;
		phoneNum = this.phoneNum;
		sex = this.sex;
		licenseDue = this.licenseDue;
		driverState = this.driverState;
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
        返回车辆状态
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








}
