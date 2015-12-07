package nju.edu.businesslogicservice.storeblservice;

import java.util.ArrayList;

import nju.edu.VO.ChangeorderVO;
import PO.StoreoutorderPO;

public interface Warehouse_outBLService {

	//新建一张入库单
	public void build(ChangeorderVO cv,String date);
	
	//查看提醒值
	public ArrayList<ChangeorderVO> checkRemind();
	
}
