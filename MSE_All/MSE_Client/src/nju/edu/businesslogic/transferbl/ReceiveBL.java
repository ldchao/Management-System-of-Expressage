package nju.edu.businesslogic.transferbl;

import java.rmi.RemoteException;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.ArriverorderVO;
import nju.edu.VO.LoadorderVO;
import nju.edu.businesslogicservice.transferblservice.ReceiveBLService;
import nju.edu.dataservice.transferdataservice.ReceiveDataService;
import PO.ArriverorderPO;
import PO.LoadorderPO;

public class ReceiveBL implements ReceiveBLService {

	LoadorderVO needinputarrive = null;

	// ������ת���ĵ��ﵥ
	@Override
	public void build(ArriverorderVO av) {
		// TODO Auto-generated method stub
		System.out.println("�½�һ�ŵ��ﵥ");
	}

	// �洢���ﵥ
	@Override
	public void save(ArriverorderPO PO) {
		ReceiveDataService receivedata = RMIHelper.getReceiveData();
		try {
			receivedata.insert(PO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		System.out.println("�洢����������ĵ��ﵥ");
	}

	// �鿴δ���յ�װ�˵�
	@Override
	public LoadorderVO checkUnreceive_loadorderPO(String s) {
		ReceiveDataService receivedata = RMIHelper.getReceiveData();
		LoadorderPO lp;
		try {
			lp = receivedata.checkUnreceive_loadorderPO(s);
			if (lp != null)
				needinputarrive = new LoadorderVO(lp.getTransferNum());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return needinputarrive;
	}

}
