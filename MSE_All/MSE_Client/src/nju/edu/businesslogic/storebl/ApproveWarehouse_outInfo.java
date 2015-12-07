package nju.edu.businesslogic.storebl;

import java.util.ArrayList;

import PO.StoreoutorderPO;

public interface ApproveWarehouse_outInfo {

	public ArrayList<StoreoutorderPO> get();

	public void save(StoreoutorderPO sp);
}
