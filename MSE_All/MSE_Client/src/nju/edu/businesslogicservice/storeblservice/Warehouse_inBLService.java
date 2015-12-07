package nju.edu.businesslogicservice.storeblservice;

import java.util.ArrayList;

import nju.edu.VO.ArriverorderVO;
import nju.edu.VO.StoreinVO;
import PO.StoreinorderPO;

public interface Warehouse_inBLService {

	//新建一张入库单
	public void build(StoreinVO sv);
	
	//查看提醒
	public String checkRemind();
	
	//删除消息提醒
	public void deleteRemind();
	
}
