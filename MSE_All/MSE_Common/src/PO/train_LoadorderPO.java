package PO;
import java.util.ArrayList;

import State.ApproveState;

//��װ�˵�
public class train_LoadorderPO extends LoadorderPO{

	public train_LoadorderPO(String date, String offNum, String transferNum,
			String arriveNum, String monitorName, String transferName,
			String transportNum, ArrayList<String> order, double fee,
			ApproveState checkState) {
		super(date, offNum, transferNum, arriveNum, monitorName, transferName,
				transportNum, order, fee, checkState);
		// TODO Auto-generated constructor stub
	}

}
