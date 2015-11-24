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
        ����˾�����
	    return String
    */
	public String getDriverNum(){
		return driverNum;
	}

	/*  getName
        ����˾������
	    return String
    */
	public String getName(){
		return name;
	}
	
	/*  getShopNum
        ����Ӫҵ�����
	    return String
    */
	public String getShopNum(){
		return shopNum;
	}

	/*  getBirthDate
        ���س�������
	    return String
    */
	public String getBirthDate(){
		return birthDate;
	}

	/*  getIdNum
        �������֤��
	    return String
    */
	public String getIdNum(){
		return idNum;
	}

	/*  getPhoneNum
        �����ֻ�����
	    return String
    */
	public String getPhoneNum(){
		return phoneNum;
	}

	/*  getSex
        �����Ա�
	    return String
    */
	public String getSex(){
		return sex;
	}

	/*  getLicenseDue
        ������ʻ֤����
	    return String
    */
	public String getLicenseDue(){
		return licenseDue;
	}

	/*  getDriverState
        ����˾��״̬
	    return String
    */
	public String getDriverState(){
		return driverState;
	}
	
	/*  setDriverState
        ����˾��״̬
        void
    */
	
	public void setDriverState() {
		this.driverState = driverState;
}
}