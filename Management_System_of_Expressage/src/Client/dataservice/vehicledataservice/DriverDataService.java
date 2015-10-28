package Client.dataservice.vehicledataservice;

import Client.PO.DriverPO;
import Client.PO.VehiclePO;

public interface DriverDataService {
	    //�½�˾����Ϣ
		public void insert(DriverPO po);
		
		//����˾����Ϣ
		public void update(DriverPO po);
		
		//����˾����Ϣ
		public DriverPO find(String name);
		
		//ɾ��˾����Ϣ
		public void delete(DriverPO po);
		

}
