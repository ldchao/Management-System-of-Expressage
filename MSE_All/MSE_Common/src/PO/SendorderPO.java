package PO;
import java.io.Serializable;
import java.util.ArrayList;

public class SendorderPO implements Serializable{
	String date;
	String sender;
	ArrayList<String> order;

	public SendorderPO(String date,String sender,
		ArrayList<String> order){
		date = this.date;
		sender = this.sender;
		order = this.order;
	}
    

    /*  getDate
        杩斿洖娲鹃�佹棩鏈�
	    return String
    */
	public String getDate(){
		return date;
	}

	/*  getSender
        杩斿洖娲鹃�佸憳
	    return sender
    */
	public String getSender(){
		return sender;
	}
	
	/*  getOrder
        杩斿洖璁㈠崟鍙锋竻鍗�
	    return ArrayList<String>
    */
	public ArrayList<String> getOrder(){
		return order;
	}


}
