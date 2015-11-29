package nju.edu.VO;

import java.io.Serializable;
import java.util.ArrayList;

import State.ApproveState;
import State.ArriveState;

public class ReceiFormVO implements Serializable {

	String data; //��������
	String departPlace;  //������
	String arriveState;  //�����
	String arrive_state;  //���ﵽ��״̬  4
	
	String carNum;  //ͨ��װ�˵����ǰ��λ�õ���ͨ���ߴ���
	String monitorName;  //��װԱ����
	String transferName;  //Ѻ��Ա���� 
	ArrayList<String> order;  //���ж������
	
	public ReceiFormVO(String data,  String departPlace,
			String arriveState,String arrive_state, String carNum, String monitorName,
			String transferName, ArrayList<String> order) {
		super();
		this.data = data;
		this.departPlace = departPlace;
		this.arriveState = arriveState;
		this.arrive_state = arrive_state;
		this.carNum = carNum;
		this.monitorName = monitorName;
		this.transferName = transferName;
		this.order = order;
	}

	public String getData() {
		return data;
	}

	public String getDepartPlace() {
		return departPlace;
	}

	public String getArriveState() {
		return arriveState;
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

	
	public ArrayList<String> getOrderNum() {
		return order;
	} 
	
	
}
