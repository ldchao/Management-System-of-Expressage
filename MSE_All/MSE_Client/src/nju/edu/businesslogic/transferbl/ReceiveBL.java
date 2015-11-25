package nju.edu.businesslogic.transferbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.LoadorderVO;
import nju.edu.businesslogicservice.transferblservice.ReceiveBLService;
import nju.edu.dataservice.transferdataservice.ReceiveDataService;
import PO.ArriverorderPO;
import PO.LoadorderPO;

public class ReceiveBL implements ReceiveBLService{
	
	LoadorderVO needinputarrive;
	
	//创建中转中心到达单
	@Override
	public void build(LoadorderVO lv, String as) {
		// TODO Auto-generated method stub
		System.out.println("新建一张到达单");
	}

	//存储到达单
	@Override
	public void save(ArriverorderPO PO) {
		// TODO Auto-generated method stub
		System.out.println("存储到达单");
	}
	
	//查看未接收的装运单
	@Override
	public LoadorderVO checkUnreceive_loadorderPO(String s) {
		ReceiveDataService receivedata=RMIHelper.getReceiveData();
		try {
			LoadorderPO lp=receivedata.checkUnreceive_loadorderPO(s);
		} catch (RemoteException e) {
          e.printStackTrace();
		}
		
		return needinputarrive;
	}

	
	
	
}
