package nju.edu.VO;

import java.io.Serializable;

public class VehicleVO implements Serializable {
	String carNum;
	String engineNum;
	String car;
	String baseNum;
	String buyDate;
	String useDate; 
	String carState;

	public VehicleVO(String carNum,String engineNum,String car,String baseNum,
		String buyDate,String useDate, String carState){
		carNum = this.carNum;
		engineNum = this.engineNum;
		car = this.car;
		baseNum = this.baseNum;
		buyDate = this.buyDate;
		useDate = this.useDate;
		carState = this.carState;
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

	/*  getBaseNum
        ���ص��̺�
	    return String
    */
	public String getBaseNum(){
		return baseNum;
	}

	/*  getBuyDate
        ���ع�������
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
	public String getCarState(){
		return carState;
	}
	/*  getCarState
        ���ó���״̬
        void
*/
	
    public void setCarState(String carState){
    	this.carState = carState;
    }






	
}