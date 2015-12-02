package nju.edu.businesslogic.storebl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.StoreinVO;
import nju.edu.businesslogicservice.storeblservice.Warehouse_inBLService;
import nju.edu.businesslogicservice.transferblservice.StoreinInfo;
import nju.edu.dataservice.storedataservice.Warehouse_inDataService;
import PO.OrganizationNumPO;
import PO.StoreinorderPO;
import State.ApproveState;

public class Warehouse_inBL implements Warehouse_inBLService,StoreinInfo{
	

	
	//�½�һ����ⵥ
	@Override
	public void build(StoreinVO sv) {
		Warehouse_inDataService wd=RMIHelper.getWarehouse_inData();
		StoreinorderPO sp=new StoreinorderPO(sv.getOrder_number(), sv.getDate(),
				sv.getOffnum(), sv.getQu(), sv.getPai(), sv.getWei(), 
				sv.getJia(), ApproveState.NotApprove);
		try {
			wd.insert(sp);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		System.out.println("��ⵥ���ύ�ܾ�������");
	}

	//��������
	@Override
	public String checkRemind() {
		String needinstore="";
		Warehouse_inDataService wd=RMIHelper.getWarehouse_inData();
		ArrayList<String> arriveOrderList;
		OrganizationNumPO op=new OrganizationNumPO();
		try {
			arriveOrderList = wd.checkUnstoreinArriveorder();
		} catch (RemoteException e) {
			arriveOrderList =null;
			e.printStackTrace();
		}
		for(String arriverorder:arriveOrderList){
			if(arriverorder.length()!=0){
			   String[] order=arriverorder.split(";");
			   needinstore+=(order[0]+"����"+op.getName(order[2])+"�Ļ�����Ҫ������⣡"+"\n");
			   }
		}		
		return needinstore;
	}
	//ɾ����Ϣ����
	@Override
	public void deleteRemind() {
		Warehouse_inDataService wd=RMIHelper.getWarehouse_inData();
		try {
			wd.deleteRemind();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}

	//�洢�½�������ⵥ
	@Override
	public void save(StoreinorderPO sp) {
		Warehouse_inDataService wd=RMIHelper.getWarehouse_inData();
		try {
			wd.insert(sp);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		System.out.println("�洢��ⵥ");
	}

	////���ݿ�λ�õ���Ӧλ�õĶ������
	@Override
	public ArrayList<String> getId(int[][][][] location) {
		// TODO Auto-generated method stub
		ArrayList<String> Idlist=new ArrayList<String> ();
		
		return Idlist;
	}

	private void update(){
		
		//��save�е��ã����¶���������Ϣ�Լ��ֿ����λ�ÿ����Ϣ
	}

	
	
}
