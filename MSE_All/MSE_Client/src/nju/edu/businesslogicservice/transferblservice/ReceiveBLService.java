package nju.edu.businesslogicservice.transferblservice;

import java.util.ArrayList;

import nju.edu.VO.ArriverorderVO;
import nju.edu.VO.LoadorderVO;
import PO.ArriverorderPO;

public interface ReceiveBLService {

	//������ת���ĵ��ﵥ
	public void build(ArriverorderVO av);
		
	//�鿴δ���յ�װ�˵�
	public LoadorderVO checkUnreceive_loadorderPO(String s);
	
}
