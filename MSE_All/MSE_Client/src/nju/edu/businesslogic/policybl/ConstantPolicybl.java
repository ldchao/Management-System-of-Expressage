package nju.edu.businesslogic.policybl;

import java.rmi.RemoteException;

import PO.ConstantPO;
import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.ConstantVO;
import nju.edu.businesslogicservice.policyblservice.ConstantInfo;
import nju.edu.businesslogicservice.policyblservice.ConstantPolicyBLService;
import nju.edu.dataservice.policydataservice.ConstantPolicyDataService;

public class ConstantPolicybl implements ConstantPolicyBLService,ConstantInfo{
	ConstantPolicyDataService constantPolicyDataService=RMIHelper.getConstantPolicyData();
	@Override
	public ConstantVO checkConstant(String address1, String address2) {
		// TODO Auto-generated method stub
		ConstantPO po=null;
		try {
			po=constantPolicyDataService.find(address1, address2);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConstantVO vo=new ConstantVO(po.getAddress1(), po.getAddress2(), po.getDistance(), po.getPrice());
		return vo;
	}

	@Override
	public void editConstant(ConstantVO vo) {
		// TODO Auto-generated method stub
		ConstantPO po=new ConstantPO(vo.getAddress1(), vo.getAddress2(), vo.getDistance(), vo.getPrice());
		try {
			constantPolicyDataService.updateConstant(po);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void endConstant() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double GetDistance(String address1, String address2) {
		// TODO Auto-generated method stub
		
		return 0;
	}

	@Override
	public double GetMoney(String address1, String address2) {
		// TODO Auto-generated method stub
		return 0;
	}


}
