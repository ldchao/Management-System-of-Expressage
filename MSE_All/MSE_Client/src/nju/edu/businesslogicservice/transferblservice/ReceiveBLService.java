package nju.edu.businesslogicservice.transferblservice;

import java.util.ArrayList;

import nju.edu.VO.LoadorderVO;
import PO.ArriverorderPO;

public interface ReceiveBLService {

	//������ת���ĵ��ﵥ
	public void build(LoadorderVO lv,String as);
		
	//�鿴δ���յ�װ�˵�
	public LoadorderVO checkUnreceive_loadorderPO(String s);
	
	//�洢���ﵥ
	public void save(ArriverorderPO PO);
	
}
