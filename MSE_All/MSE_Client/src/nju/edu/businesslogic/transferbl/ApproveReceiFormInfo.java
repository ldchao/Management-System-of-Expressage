package nju.edu.businesslogic.transferbl;

import java.util.ArrayList;

import PO.ReceiveorderPO;

public interface ApproveReceiFormInfo {
	public ArrayList<ReceiveorderPO> get();

	public void save(ReceiveorderPO rp);
}
