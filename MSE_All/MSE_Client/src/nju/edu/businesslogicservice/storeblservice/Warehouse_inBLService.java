package nju.edu.businesslogicservice.storeblservice;

import java.util.ArrayList;

import nju.edu.VO.ArriverorderVO;
import nju.edu.VO.StoreLocationVO;
import nju.edu.VO.StoreinVO;
import PO.StoreinorderPO;

public interface Warehouse_inBLService {

	//�½�һ����ⵥ
	public void build(StoreinVO sv);
	
	//�鿴����
	public String checkRemind();
	
	//ɾ����Ϣ����
	public void deleteRemind();
	
	//���ʱ���ݶ������Զ����ɿ��λ��
	public StoreLocationVO getStoreLocation(String id,String storeNum);
}
