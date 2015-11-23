package Client.dataservice.vehicledataservice;

import PO.DriverPO;

public interface DriverDataService {
	    //新建司机信息
		public void insert(DriverPO po);
		
		//更新司机信息
		public void update(DriverPO po);
		
		//查找司机信息
		public DriverPO find(String name);
		
		//删除司机信息
		public void delete(DriverPO po);
		

}
