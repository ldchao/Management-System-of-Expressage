package Client.PO;
import java.io.Serializable;
import java.util.ArrayList;

public class PayeeorderPO implements Serializable{
	String date;
	String carrierName;
	String recorder;
	ArrayList<String> order;
	ArrayList<Integer> price;


	public PayeeorderPO(String date,String carrierName,String recorder,
		ArrayList<String> order,ArrayList<Integer> price){
		date = this.date;
		carrierName = this.carrierName;
		recorder = this.recorder;
		order = this.order;
		price = this.price;
	}
    

    /*  getDate
        返回收款单日期
	    return String
    */
	public String getDate(){
		return date;
	}

	/*  getCarrierName
        返回快递员姓名
	    return String
    */
	public String getCarrierName(){
		return carrierName;
	}
	
	/*  getRecorder
        返回记录员姓名
	    return String
    */
	public String getRecorder(){
		return recorder;
	}

	/*  getOrder
        返回订单号清单
	    return ArrayList<String>
    */
	public ArrayList<String> getOrder(){
		return order;
	}

	/*  getPrice
        返回价格清单
	    return ArrayList<Integer>
    */
	public ArrayList<Integer> getPrice(){
		return price;
	}




}
