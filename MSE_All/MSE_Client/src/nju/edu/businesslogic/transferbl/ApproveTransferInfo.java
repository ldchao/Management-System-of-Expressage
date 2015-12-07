package nju.edu.businesslogic.transferbl;

import java.util.ArrayList;

import PO.ChangeorderPO;

public interface ApproveTransferInfo {
	public ArrayList<ChangeorderPO> get();

	public void save(ChangeorderPO cp);
}
