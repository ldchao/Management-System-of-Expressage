package nju.edu.businesslogic.transferbl;

import nju.edu.VO.ChangeorderVO;
import nju.edu.businesslogic.storebl.StoreMessageBL;
import nju.edu.businesslogicservice.transferblservice.StoreinInfo;
import nju.edu.businesslogicservice.transferblservice.TransferBLService;
import PO.ChangeorderPO;

public class TransferBL implements TransferBLService{

	@Override
	public void build(ChangeorderVO cv) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String checkRemind() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[][] checkStore() {
		StoreinInfo sm=StoreMessageBL.getInstance();		
		return sm.getStoreRatio();
	}
	
	@Override
	public void save(ChangeorderPO cp) {
		// TODO Auto-generated method stub
		
	}

	

	

}
