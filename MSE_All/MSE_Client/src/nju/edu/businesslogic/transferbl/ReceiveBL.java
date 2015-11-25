package nju.edu.businesslogic.transferbl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.LoadorderVO;
import nju.edu.businesslogicservice.transferblservice.ReceiveBLService;
import nju.edu.dataservice.transferdataservice.ReceiveDataService;
import PO.ArriverorderPO;
import PO.LoadorderPO;

public class ReceiveBL implements ReceiveBLService{
	
	LoadorderVO needinputarrive;
	
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
		ReceiveDataService receivedata=RMIHelper.getReceiveData();
		try {
			LoadorderPO lp=receivedata.checkUnreceive_loadorderPO(s);
		} catch (RemoteException e) {
          e.printStackTrace();
		}
		
		return needinputarrive;
	}

	
	
	
}
