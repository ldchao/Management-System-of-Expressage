package nju.edu.businesslogic.transferbl;

import java.util.ArrayList;

import PO.SendorderPO;

public interface ApproveSendFormInfo {
	public ArrayList<SendorderPO> get();

	public void save(SendorderPO cp);
}
