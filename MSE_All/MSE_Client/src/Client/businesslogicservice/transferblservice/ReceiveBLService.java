package Client.businesslogicservice.transferblservice;

import java.util.ArrayList;

import Client.VO.LoadorderVO;
import PO.ArriverorderPO;

public interface ReceiveBLService {

	//������ת���ĵ��ﵥ
	public void build(LoadorderVO lv,String as);
	
	//�������ѣ������л��ﵽ��
	public void setRemind(LoadorderVO lv);
	
	//�鿴��Ϣ����
	public ArrayList<LoadorderVO> checkRemind();
	
	//�洢���ﵥ
	public void save(ArriverorderPO PO);
	
}
