package Server.Date_Stub.vehicleDateservice_Stub;

import PO.DriverPO;
import Server.dataservice.vehicledataservice.DriverDataService;

public class DriverDataService_Stub implements DriverDataService{

	public void insert(DriverPO po) {
		System.out.println("�½�˾����Ϣ�ɹ���");		
		
	}

	@Override
	public void update(DriverPO po) {
		System.out.println("����˾����Ϣ�ɹ���");		
		
	}

	@Override
	public DriverPO find(String name) {
		System.out.println("����˾����Ϣ�ɹ���");
		DriverPO po = new DriverPO("124234", "125", "52341", 
				"2341", "2014", "2015", "123124","sdfsdf","sfwef");
		return po;
	}

	@Override
	public void delete(DriverPO po) {
		System.out.println("ɾ��˾����Ϣ�ɹ���");		
		
	}

}
