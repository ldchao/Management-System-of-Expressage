package Client.dataservice.financedataservice;

import java.util.ArrayList;

import PO.PayorderPO;

public interface PayorderDataService {

	// �½����
	public void insert(PayorderPO po);

	// �鿴���ʱ�������и����Ϣ
	public ArrayList<PayorderPO> find();

	// �鿴�ɱ����棨������֧�������롢����
	public double profit(double[] pay, double[] payee);

	// ����������ǰ���ڵĳɱ������
	public void excel(String date, double income, double outcome, double benefit);
}
