package Client.businesslogicservice.storeblservice;

import Client.PO.StoreinorderPO;
import Client.VO.ArriverorderVO;

public interface Warehouse_inblservice {

	//�½�һ����ⵥ
	public void build(ArriverorderVO av,int jia,int wei);
	
	//���ｨ�����ﵥ����������ֵ
	public void setRemind(ArriverorderVO av);
	
	//��������
	public String checkRemind();
	
	//�洢�½�������ⵥ
	public void save(StoreinorderPO sp);
	
}
