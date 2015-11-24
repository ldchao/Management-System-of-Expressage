package nju.edu.businesslogicservice.storeblservice;

import java.util.ArrayList;

import nju.edu.VO.ArriverorderVO;
import PO.StoreinorderPO;

public interface Warehouse_inBLService {

	//�½�һ����ⵥ
	public void build(ArriverorderVO av,int jia,int wei);
	
	//���ｨ�����ﵥ����������ֵ
	public void setRemind(ArriverorderVO av);
	
	//�鿴����
	public ArrayList<ArriverorderVO> checkRemind();
	
	//�洢�½�������ⵥ
	public void save(StoreinorderPO sp);
	
}
