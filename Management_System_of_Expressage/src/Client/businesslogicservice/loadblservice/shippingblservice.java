package Client.businesslogicservice.loadblservice;

import Client.PO.LoadorderPO;
import Client.VO.ChangeorderVO;

public interface shippingblservice {
  
	//����װ����
	public void build(ChangeorderVO cv,String car_number,String monitor,String transfer);
	
	//�����������Ϻ���������ֵ
	public void setRemind(ChangeorderVO cv);
	
	//�鿴����ֵ
	public String checkRemind();
	
	//�洢�½���װ����
	public void save(LoadorderPO lp);
	
}