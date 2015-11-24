package nju.edu.dataservice.policydataservice;

import PO.ConstantPO;

public interface ConstantPolicyDataService {
	public ConstantPO find(String address1,String address2);
	
	public void updateConstant(ConstantPO po);
}
