package Server.dataservice.financedataservice;

import java.util.ArrayList;

import Client.PO.PayorderPO;
import Client.VO.PayorderVO;

public interface PayorderDataService {

	// �½����
	public void insert(PayorderPO po);

	// �鿴���ʱ�������и����Ϣ
	public ArrayList<PayorderVO> find();

	// �鿴�ɱ����棨������֧�������롢����
	public double profit(double[] pay, double[] payee);

	// ����������ǰ���ڵĳɱ������
	public void excel(String date, double income, double outcome, double benefit);
}
