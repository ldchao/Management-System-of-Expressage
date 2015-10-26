package Server.dataservice.vehicledataservice;

import Client.PO.VehiclePO;

public interface VehicleDataService {
	
	//新建车辆信息
	public void insert(VehiclePO po);
	
	//更新车辆信息
	public void update(VehiclePO po);
	
	//查找车辆信息
	public VehiclePO find(String carNum);
	
	//删除车辆信息
	public void delete(VehiclePO po);
	
}