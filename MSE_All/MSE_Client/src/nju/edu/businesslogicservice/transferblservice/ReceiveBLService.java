package nju.edu.businesslogicservice.transferblservice;

import java.util.ArrayList;

import nju.edu.VO.ArriverorderVO;
import nju.edu.VO.LoadorderVO;
import PO.ArriverorderPO;

public interface ReceiveBLService {

	//创建中转中心到达单
	public void build(ArriverorderVO av);
		
	//查看未接收的装运单
	public LoadorderVO checkUnreceive_loadorderPO(String s);
	
}
