package nju.edu.VO;

import java.io.Serializable;

import State.ApproveState;
import State.ArriveState;

public class ArriverorderVO implements Serializable{
	String numberOfTransferStation; //��ת���ı��  2
	String date;  //��������   1
	String offnum;  //������  3
	ArriveState arrive_state;  //���ﵽ��״̬  4
	ApproveState check_state;   //����״̬   5

	public ArriverorderVO(String numberOfTransferStation, String date,
			String offnum, ArriveState arrive_state, ApproveState check_state) {
		super();
		this.numberOfTransferStation = numberOfTransferStation;
		this.date = date;
		this.offnum = offnum;
		this.arrive_state = arrive_state;
		this.check_state = check_state;
	}
}
