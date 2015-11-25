package PO;
import java.io.Serializable;
import java.util.ArrayList;

import State.ApproveState;

public class LoadorderPO implements Serializable{
	String date;    //װ������  2
	String loadorderNum;  //װ�˵����   1
	String transferNum;     //��ת���ı�Ż�Ӫҵ�����  3
	String arriveNum;      //����ر�� 4
	String monitorName;   //��װԱ���� 5
	String transferName;   //Ѻ��Ա���� 6
	String transportNum;   //�����ţ����˱�ţ����˱�ţ����˱�ţ�  7
	ArrayList<String> order; //���ж������   8
	double fee;   //�˷�  9 
	ApproveState checkState;//����״̬  10

	public LoadorderPO(String date,String offNum,String transferNum,String arriveNum,String monitorName,String transferName,String transportNum,ArrayList<String> order,double fee,ApproveState checkState){
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

	public ApproveState getCheckState(){
		return checkState;
	}



}
