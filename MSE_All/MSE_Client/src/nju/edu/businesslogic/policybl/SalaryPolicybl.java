package nju.edu.businesslogic.policybl;

import java.rmi.RemoteException;

import PO.SalaryPO;
import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.SalaryVO;
import nju.edu.businesslogicservice.policyblservice.SalaryPolicyBLSerivce;
import nju.edu.dataservice.policydataservice.SalaryPolicyDataService;

public class SalaryPolicybl implements SalaryPolicyBLSerivce{
	SalaryPolicyDataService SalaryPolicyDataService=RMIHelper.getSalaryPolicyData();
	@Override
	public SalaryVO checkSalary(String typeOfStaff) {
		// TODO Auto-generated method stub
		SalaryPO salaryPO=null;
		SalaryVO salaryVO=null;
		try {
			salaryPO=SalaryPolicyDataService.get(typeOfStaff);
			salaryVO=new SalaryVO(salaryPO.getTypeOfStaff(), salaryPO.getSalary(), salaryPO.getTypeOfStrategy());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return salaryVO;
	}

	@Override
	public void editSalary(String typeOfStaff, String salary, int typeOfSalary) {
		// TODO Auto-generated method stub
		
	}


}
