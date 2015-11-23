package Server.dataservice.vehicledataservice;

import PO.VehiclePO;

public interface VehicleDataService {
	
	//�½�������Ϣ
	public void insert(VehiclePO po);
	
	//���³�����Ϣ
	public void update(VehiclePO po);
	
	//���ҳ�����Ϣ
	public VehiclePO find(String carNum);
	
	//ɾ��������Ϣ
	public void delete(VehiclePO po);
	
}