package Client.businesslogic.transferbl;

import java.util.ArrayList;

import Client.VO.LoadorderVO;
import Client.businesslogicservice.transferblservice.ReceiveBLService;
import PO.ArriverorderPO;

public class ReceiveBL implements ReceiveBLService{
	
	ArrayList<LoadorderVO> needinputarrive=new ArrayList<LoadorderVO>();
	
	//������ת���ĵ��ﵥ
	@Override
	public void build(LoadorderVO lv, String as) {
		// TODO Auto-generated method stub
		System.out.println("�½�һ�ŵ��ﵥ");
	}

	//�������ѣ������л��ﵽ��
	@Override
	public void setRemind(LoadorderVO lv) {
		// TODO Auto-generated method stub
		needinputarrive.add(lv);
	}

	//�鿴��Ϣ����
	@Override
	public ArrayList<LoadorderVO> checkRemind() {
		// TODO Auto-generated method stub
		return null;
	}

	//�洢���ﵥ
	@Override
	public void save(ArriverorderPO PO) {
		// TODO Auto-generated method stub
		System.out.println("�洢���ﵥ");
	}

	
	
	
}
