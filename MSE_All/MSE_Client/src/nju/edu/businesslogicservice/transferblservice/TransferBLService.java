package nju.edu.businesslogicservice.transferblservice;

import nju.edu.VO.ChangeorderVO;
import PO.ChangeorderPO;

public interface TransferBLService {
	
	//������ת��
	public void build(ChangeorderVO cv);
	 
	 //�鿴��Ϣ����
	 public String checkRemind(String transferNum);
	 
	 //�鿴��ǰ��������������
	 public String[][] checkStore(String transferNum);
}
