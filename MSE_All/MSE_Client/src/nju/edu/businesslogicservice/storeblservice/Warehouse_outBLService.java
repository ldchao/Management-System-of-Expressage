package nju.edu.businesslogicservice.storeblservice;

import java.util.ArrayList;

import nju.edu.VO.ChangeorderVO;
import PO.StoreoutorderPO;

public interface Warehouse_outBLService {

	//�½�һ����ⵥ
	public void build(ChangeorderVO cv,String date);
	
	//�鿴����ֵ
	public ArrayList<ChangeorderVO> checkRemind();
	
}
