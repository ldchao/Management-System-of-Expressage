package Client.businesslogicservice.billblservice;

import java.util.ArrayList;

import Client.VO.vo.StartinfoVO;

public interface BillBLService {

	// �½���
	public void insert(String institution, String staff, String vehicle,
			String store, String account, String data, String creator);

	// �鿴�ڳ���Ϣʱ��ʾ�����ʵ���Ϣ
	public ArrayList<StartinfoVO> check();
}