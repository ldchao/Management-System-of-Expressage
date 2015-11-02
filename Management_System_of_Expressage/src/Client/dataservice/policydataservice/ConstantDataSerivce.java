package Client.dataservice.policydataservice;

import Client.PO.ConstantPO;

public interface ConstantDataSerivce {
	public ConstantPO find(String address1,String address2);
	
	public void updateConstant(ConstantPO po);
}
