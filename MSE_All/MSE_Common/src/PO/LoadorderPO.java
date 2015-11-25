package PO;
import java.io.Serializable;
import java.util.ArrayList;

public class LoadorderPO implements Serializable{
	String date;    //装运日期
	String loadorderNum;  //装运单编号
	String transferNum;     //中转中心编号或营业厅编号
	String arriveNum;      //到达地编号
	String monitorName;   //监装员姓名
	String transferName;   //押运员姓名
	String transportNum;   //运输编号（汽运编号，铁运编号，航运编号）
	ArrayList<String> order; //所有订单编号
	double fee;   //运费
	int checkState;//审批状态

	public LoadorderPO(String date,String offNum,String transferNum,String arriveNum,String monitorName,String transferName,String transportNum,ArrayList<String> order,double fee,int checkState){
		super();
		this.date = date;
		this.loadorderNum = offNum;
		this.transferNum = transferNum;
		this.arriveNum = arriveNum;
		this.monitorName = monitorName;
		this.transferName = transferName;
		this.transportNum = transportNum;
		this.order = order;
		this.fee = fee;
		this.checkState = checkState;
	}

	public String getDate(){
		return date;
	}

	public String getLoadorderNum(){
		return loadorderNum;
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
