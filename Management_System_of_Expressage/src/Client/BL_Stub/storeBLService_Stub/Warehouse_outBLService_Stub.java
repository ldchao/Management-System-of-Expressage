package Client.BL_Stub.storeBLService_Stub;

import java.util.ArrayList;

import Client.PO.StoreoutorderPO;
import Client.VO.ChangeorderVO;
import Client.businesslogicservice.storeblservice.Warehouse_outBLService;

public class Warehouse_outBLService_Stub implements Warehouse_outBLService{

	ArrayList<ChangeorderVO> needoutstore=new ArrayList<ChangeorderVO>();
	
	//�½�һ����ⵥ
	@Override
	public void build(ChangeorderVO cv, String number) {
		// TODO Auto-generated method stub
		System.out.println("�½�һ�ų��ⵥ");
	}

	//����¼����ת������������
	@Override
	public void setRemind(ChangeorderVO cv) {
		// TODO Auto-generated method stub
		needoutstore.add(cv);
	}

	//�鿴����ֵ
	@Override
	public ArrayList<ChangeorderVO> checkRemind() {
		// TODO Auto-generated method stub
		return needoutstore;
	}

	//�洢�½�����ⵥ
	@Override
	public void save(StoreoutorderPO sp) {
		// TODO Auto-generated method stub
		System.out.println("�洢һ�ų��ⵥ");
	}

}
