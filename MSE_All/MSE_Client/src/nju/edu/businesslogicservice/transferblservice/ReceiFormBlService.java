package nju.edu.businesslogicservice.transferblservice;

import java.util.ArrayList;

import nju.edu.VO.ReceiFormVO;
import PO.ReceiveorderPO;

public interface ReceiFormBlService {
    
	
	//�½����յ�
	public void addReceiveOrder(ReceiFormVO rv);
	
	//������յ�
	public void save(ReceiveorderPO rp);
	
	//���¶���������Ϣ��˾������װԱ��Ѻ��Ա������״̬��Ϣ
	public void update();
}