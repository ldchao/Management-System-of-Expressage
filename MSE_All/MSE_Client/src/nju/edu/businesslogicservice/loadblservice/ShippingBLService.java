package nju.edu.businesslogicservice.loadblservice;

import java.util.ArrayList;

import nju.edu.VO.ChangeorderVO;
import PO.LoadorderPO;

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
