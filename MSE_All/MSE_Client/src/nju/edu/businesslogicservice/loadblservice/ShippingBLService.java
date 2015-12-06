package nju.edu.businesslogicservice.loadblservice;

import java.util.ArrayList;

import nju.edu.VO.ChangeorderVO;
import nju.edu.VO.VehicleLoadorderVO;
import PO.LoadorderPO;

public interface ShippingBLService {
  
	//����װ����
	public void build(VehicleLoadorderVO vv);
	
	//�õ����˷�
	public double getTotal(ArrayList<String> orderlist,String offNum,String arriveNum,String wayOfTransfer);
	
	//�鿴����ֵ
	public ArrayList<ChangeorderVO> checkRemind();
	
	//�洢�½���װ����
	public void save(LoadorderPO lp);
	
}
