import java.io.Serializable;
import java.util.ArrayList;

public class LoadorderPO implements Serializable{
	String date;
	String offNum;
	String transferNum;
	String arriveNum;
	String monitorName;
	String transferName;
	String transportNum;
	ArrayList<String> order;
	double fee;
	int checkState;

	public LoadorderPO(String date,String offNum,String transferNum,String arriveNum,String monitorName,String transferName,String transportNum,ArrayList<String> order,double fee,int checkState){
		date = this.date;
		offNum = this.offNum;
		transferNum = this.transferNum;
		arriveNum = this.arriveNum;
		monitorName = this.monitorName;
		transferName = this.transferName;
		transportNum = this.transportNum;
		order = this.order;
		fee = this.fee;
		checkState = this.checkState;
	}

	public String getDate(){
		return date;
	}

	public String getOffNum(){
		return offNum;
	}

	public String getTransferNum(){
		return transferNum;
	}

	public String getArriveNum(){
		return arriveNum;
	}

	public String getMonitorName(){
		return monitorName;
	}

	public String getTransferName(){
		return transferName;
	}

	public String getTransportNum(){
		return transportNum;
	}

	public ArrayList<String> getOrder(){
		return order;
	}

	public double getFee(){
		return fee;
	}

	public int getCheckState(){
		return checkState;
	}



}
