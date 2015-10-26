package Server.dataservice.policydataservice;

import Client.PO.ConstantPO;
import Client.PO.SalaryPO;

public interface PolicyDataService {
	public SalaryPO get(String typeOfStaff);
	
	public void updateSalary(SalaryPO po);
	
	public ConstantPO find(String address1,String address2);
	
	public void updateConstant(ConstantPO po);
}
