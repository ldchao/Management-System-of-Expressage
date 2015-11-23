package Server.Date_Stub.vehicleDateservice_Stub;

import PO.VehiclePO;
import Server.dataservice.vehicledataservice.VehicleDataService;

public class VehicleDataService_Stub implements VehicleDataService{

	@Override
	public void insert(VehiclePO po) {
		System.out.println("新建车辆信息成功！");		
		
	}

	@Override
	public void update(VehiclePO po) {
		System.out.println("更新车辆信息成功！");		
		
	}

	@Override
	public VehiclePO find(String carNum) {
		System.out.println("查找车辆信息成功！");		
		VehiclePO po = new VehiclePO("124234", "125", "52341", 
				"2341", "2014", "2015", "空闲");
		return po;
	}

	@Override
	public void delete(VehiclePO po) {
		System.out.println("删除车辆信息成功！");		
		
	}

}
