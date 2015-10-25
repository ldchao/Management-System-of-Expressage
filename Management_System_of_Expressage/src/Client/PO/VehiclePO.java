public class VehiclePO implements Serializable{
	String carNum;
	String engineNum;
	String car;
	String baseNum;
	String buyDate;
	String useDate; 
	String carState;

	public VehiclePO(SString carNum,String engineNum,String car,String baseNum,
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

	/*  getBaseNum
        返回底盘号
	    return String
    */
	public String getBaseNum(){
		return baseNum;
	}

	/*  getBuyDate
        返回购买日期
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
	public String getCarState(){
		return carState;
	}






}
