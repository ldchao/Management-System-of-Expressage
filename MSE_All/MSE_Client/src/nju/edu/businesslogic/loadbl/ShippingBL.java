package nju.edu.businesslogic.loadbl;

import java.util.ArrayList;

import nju.edu.VO.ChangeorderVO;
import nju.edu.businesslogicservice.loadblservice.ShippingBLService;
import PO.LoadorderPO;

public class ShippingBL implements ShippingBLService {

	// ��װ�˵���ת��
	ArrayList<ChangeorderVO> needship = new ArrayList<ChangeorderVO>();

	// �½�һ��װ�˵�
	@Override
	public void build(ChangeorderVO cv, String car_number, String monitor,
			String transfer) {
		// TODO Auto-generated method stub
		System.out.println("�½�һ��װ�˵�");

	}

	// �����������Ϻ���������ֵ
	@Override
	public void setRemind(ChangeorderVO cv) {
		// TODO Auto-generated method stub
		needship.add(cv);
	}

	// �鿴����ֵ
	@Override
	public ArrayList<ChangeorderVO> checkRemind() {
		// TODO Auto-generated method stub
		return needship;
	}

	// �洢�½���װ����
	@Override
	public void save(LoadorderPO lp) {
		// TODO Auto-generated method stub
		System.out.println("�洢�½���װ����");
	}
}
