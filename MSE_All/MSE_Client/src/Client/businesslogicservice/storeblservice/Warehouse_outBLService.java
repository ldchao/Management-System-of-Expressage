package Client.businesslogicservice.storeblservice;

import java.util.ArrayList;

import Client.VO.ChangeorderVO;
import PO.StoreoutorderPO;

public interface Warehouse_outBLService {

	//�½�һ����ⵥ
	public void build(ChangeorderVO cv,String number);
	
	//����¼����ת������������
	public void setRemind(ChangeorderVO cv);
	
	//�鿴����ֵ
	public ArrayList<ChangeorderVO> checkRemind();
	
	//�洢�½�����ⵥ
	public void save(StoreoutorderPO sp);
}
