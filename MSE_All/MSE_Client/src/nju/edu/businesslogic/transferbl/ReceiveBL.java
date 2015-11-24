package nju.edu.businesslogic.transferbl;

import java.util.ArrayList;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.LoadorderVO;
import nju.edu.businesslogicservice.transferblservice.ReceiveBLService;
import nju.edu.dataservice.transferdataservice.ReceiveDataService;
import PO.ArriverorderPO;

public class ReceiveBL implements ReceiveBLService{
	
	LoadorderVO needinputarrive=new LoadorderVO();
	
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
//		ReceiveDataService receivedata=RMIHelper.g
		
		return needinputarrive;
	}

	
	
	
}
