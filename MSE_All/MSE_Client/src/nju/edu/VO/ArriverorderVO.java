package nju.edu.VO;

import java.io.Serializable;
import java.util.ArrayList;

public class ArriverorderVO implements Serializable{
	String numberOfTransferStation; //��ת���ı��  2
	String date;  //��������   1
	String offnum;  //������  3
	String arrive_state;  //���ﵽ��״̬  4
	
	String carNum;  //ͨ��װ�˵����ǰ��λ�õ���ͨ���ߴ���
	String monitorName;  //��װԱ����
	String transferName;  //Ѻ��Ա���� 
	ArrayList<String> order;  //���ж������

	public ArriverorderVO(String numberOfTransferStation, String date,
			String offnum,String arrive_state, String carNum, String monitorName,
			String transferName, ArrayList<String> order) {
		super();
		this.numberOfTransferStation = numberOfTransferStation;
		this.date = date;
		this.offnum = offnum;
		this.arrive_state = arrive_state;
		this.carNum = carNum;
		this.monitorName = monitorName;
		this.transferName = transferName;
		this.order = order;
	}

	public String getNumberOfTransferStation() {
		return numberOfTransferStation;
	}

	public String getDate() {
		return date;
	}

	public String getOffnum() {
		return offnum;
	}

	public String getArrive_state() {
		return arrive_state;
	}
	
	public String getCarNum() {
		return carNum;
	}

	public String getMonitorName() {
		return monitorName;
	}

	public String getTransferName() {
		return transferName;
	}

	public ArrayList<String> getOrder() {
		return order;
	}

}
