package Server.dataservice.policydataservice;

import PO.SalaryPO;

public interface SalaryPolicyDataService {
	public SalaryPO get(String typeOfStaff);
	
	public void updateSalary(SalaryPO po);
}
