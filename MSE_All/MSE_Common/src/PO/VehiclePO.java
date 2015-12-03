package PO;
import java.io.Serializable;

import State.TransportState;

public class VehiclePO implements Serializable{
	String carNum;
	String engineNum;
	String car;
	String baseNum;
	String buyDate;
	String useDate; 
	TransportState carState;

	public VehiclePO(String carNum,String engineNum,String car,String baseNum,
		String buyDate,String useDate, TransportState carState){
		carNum = this.carNum;
		engineNum = this.engineNum;
		car = this.car;
		baseNum = this.baseNum;
		buyDate = this.buyDate;
		useDate = this.useDate;
		carState = this.carState;
	}
    

    /*  getCarNum
        杩斿洖杞﹁締浠ｅ彿
	    return String
    */
	public String getCarNum(){
		return carNum;
	}

	/*  getEnginNum
        杩斿洖鍙戝姩鏈轰唬鍙�
	    return String
    */
	public String getEngineNum(){
		return engineNum;
	}
	
	/*  getCar
        杩斿洖杞﹁締鍙�
	    return String
    */
	public String getCar(){
		return car;
	}

	/*  getBaseNum
        杩斿洖搴曠洏鍙�
	    return String
    */
	public String getBaseNum(){
		return baseNum;
	}

	/*  getBuyDate
        杩斿洖璐拱鏃ユ湡
	    return String
    */
	public String getBuyDate(){
		return buyDate;
	}

	/*  getUseDate
        杩斿洖鏈嶅焦鏃堕棿
	    return String
    */
	public String getUseDate(){
		return useDate;
	}

	/*  getCarState
        杩斿洖杞﹁締鐘舵��
	    return String
    */
	public TransportState getCarState(){
		return carState;
	}
	/*  getCarState
        璁剧疆杞﹁締鐘舵��
        void
*/
	
    public void setCarState(TransportState carState){
    	this.carState = carState;
    }






}
