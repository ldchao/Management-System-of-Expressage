package nju.edu.businesslogic.transferbl;

import java.util.ArrayList;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.LoadorderVO;
import nju.edu.businesslogicservice.transferblservice.ReceiveBLService;
import nju.edu.dataservice.transferdataservice.ReceiveDataService;
import PO.ArriverorderPO;

public class ReceiveBL implements ReceiveBLService{
	
	LoadorderVO needinputarrive=new LoadorderVO();
	
	//������ת���ĵ��ﵥ
	@Override
	public void build(LoadorderVO lv, String as) {
		// TODO Auto-generated method stub
		System.out.println("�½�һ�ŵ��ﵥ");
	}

	//�洢���ﵥ
	@Override
	public void save(ArriverorderPO PO) {
		// TODO Auto-generated method stub
		System.out.println("�洢���ﵥ");
	}
	
	//�鿴δ���յ�װ�˵�
	@Override
	public LoadorderVO checkUnreceive_loadorderPO(String s) {
//		ReceiveDataService receivedata=RMIHelper.g
		
		return needinputarrive;
	}

	
	
	
}
