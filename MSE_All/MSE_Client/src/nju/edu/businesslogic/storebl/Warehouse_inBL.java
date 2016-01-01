package nju.edu.businesslogic.storebl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.tools.DocumentationTool.Location;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.StoreLocationVO;
import nju.edu.VO.StoreinVO;
import nju.edu.businesslogic.listinbl.Listinbl;
import nju.edu.businesslogicservice.listinblservice.OrderInfo;
import nju.edu.businesslogicservice.listinblservice.UpdateInfo;
import nju.edu.businesslogicservice.storeblservice.GetFreeLocationInfo;
import nju.edu.businesslogicservice.storeblservice.GetLocationInfo;
import nju.edu.businesslogicservice.storeblservice.StoreinUpdateInfo;
import nju.edu.businesslogicservice.storeblservice.Warehouse_inBLService;
import nju.edu.businesslogicservice.transferblservice.StoreinInfo;
import nju.edu.dataservice.storedataservice.Warehouse_inDataService;
import PO.OrganizationNumPO;
import PO.StoreinorderPO;
import State.ApproveState;

public class Warehouse_inBL implements Warehouse_inBLService,GetLocationInfo,ApproveWarehouse_inInfo{
	

	
	//�½�һ����ⵥ
	@Override
	public void build(StoreinVO sv) {
		Warehouse_inDataService wd=RMIHelper.getWarehouse_inData();
		StoreinorderPO sp=new StoreinorderPO(sv.getOrder_number(), sv.getDate(),
				sv.getOffnum(), sv.getQu(), sv.getPai(),  
				sv.getJia(),sv.getWei(), ApproveState.NotApprove);
		try {
			wd.insert(sp);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		update(sp.getOrder_number(), sp.getQu(), Integer.parseInt(sp.getPai()),
				Integer.parseInt(sp.getJia()), Integer.parseInt(sp.getWei()));
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
	
	//�õ�δ��������ⵥ
	@Override
	public ArrayList<StoreinorderPO> get() {
		ArrayList<StoreinorderPO> storeinorderList=new ArrayList<>();
		Warehouse_inDataService wd=RMIHelper.getWarehouse_inData();
		
		try {
			ArrayList<String> list=wd.get();
			for (String s : list) {
				String[] order=s.split(";");
				StoreinorderPO sp=new StoreinorderPO(order[0],
						order[1], order[2], order[3], order[4], 
						order[5], order[6], ApproveState.NotApprove);
				storeinorderList.add(sp);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return storeinorderList;
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

	//���ݶ�����ͨ��������ⵥ�ķ�ʽ���Ҷ������λ��
	@Override
	public StoreLocationVO getLocation(String orderNum) {
		Warehouse_inDataService wd=RMIHelper.getWarehouse_inData();	
		StoreLocationVO sv=null;
		try {
			String[] location=wd.getLocation(orderNum);
			sv=new StoreLocationVO(location[0], Integer.parseInt(location[1]), Integer.parseInt(location[2]), Integer.parseInt(location[3]));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return sv;
	}
	
	//���¶���������Ϣ�Ϳ����Ϣ
	private void update(String id,String qu, int pai, int jia, int wei){
		
		StoreinUpdateInfo sm=StoreMessageBL.getInstance();
		sm.storein_update(qu, pai, jia, wei, id);
		
		UpdateInfo order_update=new Listinbl();
		order_update.update(id, "�������ڸ���ת�������");
	}

	//���ʱ���ݶ������Զ����ɿ��λ��
	@Override
	public StoreLocationVO getStoreLocation(String id,String storeNum) {
		GetFreeLocationInfo gfl=StoreMessageBL.getInstance();
		ArrayList<String> transferNum=new ArrayList<>();
		transferNum.add("010");
		transferNum.add("020");
		transferNum.add("021");
		transferNum.add("025");
		transferNum.remove(storeNum);
		
		String addressNum1="0"+id.substring(0, 2);
		String addressNum2="0"+id.substring(2, 4);
		String[] all_qu={"������","������","������"};
		String qu;
		int pai=0,jia=0,wei=0;
		StoreLocationVO sv;
		if(addressNum1.equals(storeNum)){
			qu="������";
			pai=4;
			jia=Integer.parseInt(addressNum2);
			wei=gfl.getWei(jia-1);
			sv=new StoreLocationVO(qu, pai, jia, wei);			
		}else{
			int a=Integer.parseInt(id.substring(4, 5));
			qu=all_qu[a];
			for (String s:transferNum) {
				pai++;
				if(s.equals(addressNum1)){
					break;
				}				
			}
			int[] jia_wei=gfl.getJia_Wei(qu, pai-1);
			sv=new StoreLocationVO(qu, pai, jia_wei[0], jia_wei[1]);
		}
		return sv;
	}

	

	
	
}
