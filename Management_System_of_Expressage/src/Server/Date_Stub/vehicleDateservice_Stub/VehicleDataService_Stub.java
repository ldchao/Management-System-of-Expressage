package Server.Date_Stub.vehicleDateservice_Stub;

import Client.PO.VehiclePO;
import Client.dataservice.vehicledataservice.VehicleDataService;
import Server.dataservice.vehicledataservice.*;

public class VehicleDataService_Stub implements VehicleDataService{

	@Override
	public void insert(VehiclePO po) {
		System.out.println("�½�������Ϣ�ɹ���");		
		
	}

	@Override
	public void update(VehiclePO po) {
		System.out.println("���³�����Ϣ�ɹ���");		
		
	}

	@Override
	public VehiclePO find(String carNum) {
		System.out.println("���ҳ�����Ϣ�ɹ���");		
		VehiclePO po = new VehiclePO("124234", "125", "52341", 
				"2341", "2014", "2015", "����");
		return po;
	}

	@Override
	public void delete(VehiclePO po) {
		System.out.println("ɾ��������Ϣ�ɹ���");		
		
	}

}