package nju.edu.businesslogic.storebl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.businesslogicservice.storeblservice.StoreinUpdateInfo;
import nju.edu.businesslogicservice.transferblservice.StoreinInfo;
import nju.edu.dataservice.storedataservice.StoreMessageDataService;
import PO.StorePO;
import PO.StoreinorderPO;

public class StoreMessageBL implements StoreinUpdateInfo,StoreinInfo{
	
	private static StoreMessageBL store_message=null;
	private StorePO sp;

	private StoreMessageBL() {
         init();
	}

	public static StoreMessageBL getInstance() {

		if(store_message==null){
			store_message=new StoreMessageBL();
			
		}
	     return store_message;
	}

	private void init(){
		StoreMessageDataService smd=RMIHelper.getStoreMessageData();
		try {
			sp=smd.getStoreMessage();
		} catch (RemoteException e) {
			sp=null;
			e.printStackTrace();
		}
		
	}
	//�����µĿ����Ϣ�����ļ��б���
	public void save(){
		StoreMessageDataService smd=RMIHelper.getStoreMessageData();
		try {
			smd.saveStoreMessage(sp);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}
	
	//����Ǹ��¿����Ϣ

	@Override
	public void storein_update(String qu, int pai, int jia, int wei,String orderNum) {
		sp.update(qu, pai-1, jia-1, wei-1, orderNum);		
	}

	//���ݿ�λ���Ҷ�Ӧλ�õĶ������
	@Override
	public ArrayList<String> getId(String qu, int pai, int[] jia) {
		return sp.getId(qu, pai-1, jia);
	}
    //���ݿ�λ���Ҷ�Ӧλ�õĶ������
	@Override
	public ArrayList<String> getId(int jia, int[] wei) {
		return sp.getId(jia-1, wei);
	}
	//�õ��������λ�õĿ�����
	@Override
	public String[][] getStoreRatio() {	
		return sp.getStoreRatio();
	}
	
	
	
}
