package nju.edu.businesslogic.transferbl;

import java.util.ArrayList;

import PO.ArriverorderPO;

public interface ApproveReceiveInfo {
	public ArrayList<ArriverorderPO> get();

	public void save(ArriverorderPO PO);
}
