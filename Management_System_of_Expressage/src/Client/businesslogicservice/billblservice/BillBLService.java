package Client.businesslogicservice.billblservice;

import java.util.ArrayList;

import Client.VO.StartinfoVO;

public interface BillBLService {

	// �½���
	public void addBill(String institution, String staff, String vehicle,
			String store, String account, String data, String creator);

	// �鿴�ڳ���Ϣʱ��ʾ�����ʵ���Ϣ
	public ArrayList<StartinfoVO> checkBill();
}
