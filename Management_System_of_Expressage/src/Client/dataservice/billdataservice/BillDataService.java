package Client.dataservice.billdataservice;

import java.util.ArrayList;

import Client.PO.StartinfoPO;

public interface BillDataService {

	// �½���
	public void insert(StartinfoPO po);

	// ����������
	public ArrayList<StartinfoPO> find();
}
