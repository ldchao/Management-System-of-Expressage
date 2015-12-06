package nju.edu.VO;

import java.io.Serializable;
import java.util.ArrayList;

import State.ApproveState;

public class VehicleLoadorderVO implements Serializable {
	String date;    //װ������  2
	String loadorderNum;  //װ�˵����   1
	String transferNum;     //��ת���ı�Ż�Ӫҵ�����  3
	String arriveNum;      //����ر�� 4
	String monitorName;   //��װԱ���� 5
	String transferName;   //Ѻ��Ա���� 6
	String transportNum;   //�����ţ����˱�ţ����˱�ţ����˱�ţ�  7
	String order; //���ж������   8
	ArrayList<String> orderlist;
	String fee;   //�˷�  9 
	String changeorderNum;

	public VehicleLoadorderVO(String date,String loadorderNum,String transferNum,String arriveNum,
			String monitorName,String transferName,String transportNum,String order,String fee){
		super();
		this.date = date;
		this.loadorderNum = loadorderNum;
		this.transferNum = transferNum;
		this.arriveNum = arriveNum;
		this.monitorName = monitorName;
		this.transferName = transferName;
		this.transportNum = transportNum;
		this.order = order;
		this.fee = fee;
	}
	public VehicleLoadorderVO(String date,String loadorderNum,String transferNum,String arriveNum,
			String monitorName,String transferName,String transportNum,ArrayList<String> orderlist,String fee,String changeorderNum){
		super();
		this.date = date;
		this.loadorderNum = loadorderNum;
		this.transferNum = transferNum;
		this.arriveNum = arriveNum;
		this.monitorName = monitorName;
		this.transferName = transferName;
		this.transportNum = transportNum;
		this.orderlist = orderlist;
		this.fee = fee;
		this.changeorderNum=changeorderNum;
	}
	
	public String getChangeorderNum() {
		return changeorderNum;
	}
	public ArrayList<String> getOrderlist() {
		return orderlist;
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

	public String getOrder(){
		return order;
	}

	public String getFee(){
		return fee;
	}

}
