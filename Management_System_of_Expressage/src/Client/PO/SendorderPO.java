public class SendorderPO implements Serializable{
	String date;
	String sender；
	ArrayList<String> order;

	public SendorderPO(String date,String sender,
		ArrayList<String> order){
		date = this.date;
		sender = this.sender;
		order = this.order;
	}
    

    /*  getDate
        返回派送日期
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
        返回订单号清单
	    return ArrayList<String>
    */
	public ArrayList<String> getOrder(){
		return order;
	}


}
