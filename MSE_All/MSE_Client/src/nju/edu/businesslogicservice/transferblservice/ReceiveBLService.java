package nju.edu.businesslogicservice.transferblservice;

import java.util.ArrayList;

import nju.edu.VO.LoadorderVO;
import PO.ArriverorderPO;

public interface ReceiveBLService {

	//创建中转中心到达单
	public void build(LoadorderVO lv,String as);
		
	//查看未接收的装运单
	public LoadorderVO checkUnreceive_loadorderPO(String s);
	
	//存储到达单
	public void save(ArriverorderPO PO);
	
}
