package Client.dataservice.billdataservice;

import java.util.ArrayList;

import Client.PO.StartinfoPO;
import Client.VO.StartinfoVO;

public interface BillDataService {

	// �½���
	public void insert(StartinfoPO po);

	// ����������
	public ArrayList<StartinfoVO> find();
}
