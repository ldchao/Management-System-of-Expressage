package Client.PO;
import java.io.Serializable;
import java.util.ArrayList;

public class ReceiveorderPO implements Serializable{
	String date;
	String changeOrderNum;
	String departPlace;
	String arriveState;
	String name;
	ArrayList<String> order;

	public ReceiveorderPO(String date,String changeOrderNum,String departPlace,String arriveState,
		String name,ArrayList<String> order){
		date = this.date;
		changeOrderNum = this.changeOrderNum;
		departPlace = this.departPlace;
		arriveState = this.arriveState;
		name = this.name;
		order = this.order;
		
	}
    

    /*  getDate
        返回接收日期
	    return String
    */
	public String getDate(){
		return date;
	}

	/*  getChangeOrderNum
        返回中转单编号
	    return String
    */
	public String getChangeOrderNum(){
		return changeOrderNum;
	}
	
	/*  getDepartPlace
        返回出发地
	    return String
    */
	public String getDepartPlace(){
		return departPlace;
	}

	/*  getArriveState
        返回到达地
	    return String
    */
	public String getArriveState(){
		return arriveState;
	}
	/*  getName
        返回接收员
	    return String
    */
	public String getName(){
		return name;
	}
	
	/*  getOrder
        返回订单号清单
	    return ArrayList<String>
    */
	public ArrayList<String> getOrder(){
		return order;
	}


}
