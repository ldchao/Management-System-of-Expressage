package nju.edu.VO;

import java.io.Serializable;

import State.ApproveState;
import State.ArriveState;

public class ArriverorderVO implements Serializable{
	String numberOfTransferStation; //中转中心编号  2
	String date;  //到达日期   1
	String offnum;  //出发地  3
	ArriveState arrive_state;  //货物到达状态  4
	ApproveState check_state;   //审批状态   5

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
