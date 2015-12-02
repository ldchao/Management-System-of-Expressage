package nju.edu.businesslogicservice.storeblservice;

import java.util.ArrayList;

import nju.edu.VO.ArriverorderVO;
import nju.edu.VO.StoreinVO;
import PO.StoreinorderPO;

public interface Warehouse_inBLService {

	//�½�һ����ⵥ
	public void build(StoreinVO sv);
	
	//�鿴����
	public String checkRemind();
	
	//�洢�½�������ⵥ
	public void save(StoreinorderPO sp);
	
	//ɾ����Ϣ����
	public void deleteRemind();
	
}
