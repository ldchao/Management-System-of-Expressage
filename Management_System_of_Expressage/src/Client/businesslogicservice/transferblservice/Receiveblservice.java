package Client.businesslogicservice.transferblservice;

import Client.PO.ArriverorderPO;
import Client.VO.vo.LoadorderVO;

public interface Receiveblservice {

	//������ת���ĵ��ﵥ
	public void build(LoadorderVO lv,String as);
	
	//�������ѣ������л��ﵽ��
	public void setRemind(LoadorderVO lv);
	
	//�鿴��Ϣ����
	public LoadorderVO checkRemind();
	
	//�洢���ﵥ
	public void save(ArriverorderPO PO);
	
}
