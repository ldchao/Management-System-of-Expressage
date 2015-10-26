package Client.businesslogicservice.storeblservice;

import java.util.ArrayList;

import Client.PO.StoreinorderPO;
import Client.VO.ArriverorderVO;

public interface Warehouse_inBLService {

	//�½�һ����ⵥ
	public void build(ArriverorderVO av,int jia,int wei);
	
	//���ｨ�����ﵥ����������ֵ
	public void setRemind(ArriverorderVO av);
	
	//��������
	public ArrayList<ArriverorderVO> checkRemind();
	
	//�洢�½�������ⵥ
	public void save(StoreinorderPO sp);
	
}
