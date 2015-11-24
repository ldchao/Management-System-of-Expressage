package nju.edu.dataservice.policydataservice;

import PO.ConstantPO;

public interface ConstantDataSerivce {
	public ConstantPO find(String address1,String address2);
	
	public void updateConstant(ConstantPO po);
}
