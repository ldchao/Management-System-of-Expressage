package Client.businesslogicservice.loadblservice;

import java.util.ArrayList;

import Client.PO.LoadorderPO;
import Client.VO.ChangeorderVO;

public interface ShippingBLService {
  
	//����װ����
	public void build(ChangeorderVO cv,String car_number,String monitor,String transfer);
	
	//�����������Ϻ���������ֵ
	public void setRemind(ChangeorderVO cv);
	
	//�鿴����ֵ
	public ArrayList<ChangeorderVO> checkRemind();
	
	//�洢�½���װ����
	public void save(LoadorderPO lp);
	
}
