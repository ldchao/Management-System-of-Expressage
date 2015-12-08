package PO;
import java.io.Serializable;

import State.TransportState;

public class VehiclePO implements Serializable{
	String carNum;
	String engineNum;
	String car;
	String driver;
	String baseNum;
	String buyDate;
	String useDate; 
	TransportState carState;

	public VehiclePO(String carNum,String engineNum,String car,String driver, String baseNum,
		String buyDate,String useDate, TransportState carState){
		super();
		this.carNum = carNum;
		this.engineNum = engineNum;
		this.car = car;
		this.driver = driver;
		this.baseNum = baseNum;
		this.buyDate = buyDate;
		this.useDate = useDate;
		this.carState = carState;
	}
    

    /*  getCarNum
        返回车辆代号
	    return String
    */
	public String getCarNum(){
		return carNum;
	}

	/*  getEnginNum
        返回发动机代号
	    return String
    */
	public String getEngineNum(){
		return engineNum;
	}
	
	/*  getCar
        返回车辆号
	    return String
    */
	public String getCar(){
		return car;
	}
	
	/*  getDriver
    返回司机姓名
    return String
*/
	public String getDriver(){
		return driver;
	}

	/*  getBaseNum
        返回底盘号
	    return String
    */
	public String getBaseNum(){
		return baseNum;
	}

	/*  getBuyDate
        返回购买时间
	    return String
    */
	public String getBuyDate(){
		return buyDate;
	}

	/*  getUseDate
        返回服役时间
	    return String
    */
	public String getUseDate(){
		return useDate;
	}

	/*  getCarState
        返回车辆状态
	    return String
    */
	public TransportState getCarState(){
		return carState;
	}
	/*  getCarState
        设置车辆状态
        void
*/
	
    public void setCarState(TransportState carState){
    	this.carState = carState;
    }






}
