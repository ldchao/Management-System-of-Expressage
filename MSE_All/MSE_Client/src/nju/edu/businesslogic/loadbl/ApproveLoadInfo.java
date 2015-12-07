package nju.edu.businesslogic.loadbl;

import java.util.ArrayList;

import PO.LoadorderPO;

public interface ApproveLoadInfo {

	public ArrayList<LoadorderPO> get();
	
	public void save(LoadorderPO lp);
}
