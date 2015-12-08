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
        ���س�������
	    return String
    */
	public String getCarNum(){
		return carNum;
	}

	/*  getEnginNum
        ���ط���������
	    return String
    */
	public String getEngineNum(){
		return engineNum;
	}
	
	/*  getCar
        ���س�����
	    return String
    */
	public String getCar(){
		return car;
	}
	
	/*  getDriver
    ����˾������
    return String
*/
	public String getDriver(){
		return driver;
	}

	/*  getBaseNum
        ���ص��̺�
	    return String
    */
	public String getBaseNum(){
		return baseNum;
	}

	/*  getBuyDate
        ���ع���ʱ��
	    return String
    */
	public String getBuyDate(){
		return buyDate;
	}

	/*  getUseDate
        ���ط���ʱ��
	    return String
    */
	public String getUseDate(){
		return useDate;
	}

	/*  getCarState
        ���س���״̬
	    return String
    */
	public TransportState getCarState(){
		return carState;
	}
	/*  getCarState
        ���ó���״̬
        void
*/
	
    public void setCarState(TransportState carState){
    	this.carState = carState;
    }






}
