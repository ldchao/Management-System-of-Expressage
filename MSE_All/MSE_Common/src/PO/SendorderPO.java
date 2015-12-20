package PO;
import java.io.Serializable;
import java.util.ArrayList;

import State.ApproveState;

public class SendorderPO implements Serializable{
	String date;
	String sender;
	ArrayList<String> order;
	ApproveState approvestate;

	public SendorderPO(String date,String sender,
		ArrayList<String> order,ApproveState approvestate){
		this.date=date;
		this.sender=sender;
		this.order=order;
		this.approvestate=approvestate;
	}
    

    /*  getDate
        返回日期
	    return String
    */
	public String getDate(){
		return date;
	}


	/*  getSender
        返回派送员
	    return sender
    */
	public String getSender(){
		return sender;
	}
	
	/*  getOrder
        返回订单列表
	    return ArrayList<String>
    */
	public ArrayList<String> getOrder(){
		return order;
	}


	public ApproveState getApprovestate() {
		return approvestate;
	}


	public void setApprovestate(ApproveState approvestate) {
		this.approvestate = approvestate;
	}

}
