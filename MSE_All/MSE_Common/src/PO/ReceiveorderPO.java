package PO;
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
        杩斿洖鎺ユ敹鏃ユ湡
	    return String
    */
	public String getDate(){
		return date;
	}

	/*  getChangeOrderNum
        杩斿洖涓浆鍗曠紪鍙�
	    return String
    */
	public String getChangeOrderNum(){
		return changeOrderNum;
	}
	
	/*  getDepartPlace
        杩斿洖鍑哄彂鍦�
	    return String
    */
	public String getDepartPlace(){
		return departPlace;
	}

	/*  getArriveState
        杩斿洖鍒拌揪鍦�
	    return String
    */
	public String getArriveState(){
		return arriveState;
	}
	/*  getName
        杩斿洖鎺ユ敹鍛�
	    return String
    */
	public String getName(){
		return name;
	}
	
	/*  getOrder
        杩斿洖璁㈠崟鍙锋竻鍗�
	    return ArrayList<String>
    */
	public ArrayList<String> getOrder(){
		return order;
	}


}
