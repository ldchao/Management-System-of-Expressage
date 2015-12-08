package nju.edu.businesslogic.vehiclebl;

import PO.VehiclePO;
import State.TransportState;
import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.VehicleVO;
import nju.edu.businesslogicservice.vehicleblservice.VehicleBlService;
import nju.edu.dataservice.vehicledataservice.VehicleDataService;

public class VehicleBl implements VehicleBlService,transportUpdateInfo{
	VehicleDataService VehicleData = RMIHelper.getVehicleData();
	
	@Override
	public void addVehicle(VehicleVO vo) {
		VehiclePO po = new VehiclePO(vo.getCarNum(), vo.getEngineNum(), vo.getCar(), vo.getDriver(),vo.getBaseNum(), vo.getBuyDate(), vo.getUseDate(), vo.getCarState());
		try {
			VehicleData.insert(po);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateVehicle(VehicleVO vo) {
		VehiclePO po = new VehiclePO(vo.getCarNum(), vo.getEngineNum(), vo.getCar(), vo.getDriver(),vo.getBaseNum(), vo.getBuyDate(), vo.getUseDate(), vo.getCarState());
		try {
			VehicleData.update(po);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteVehicle(String carNum) {
		try {
			VehicleData.delete(VehicleData.find(carNum));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean searchVehicle(String carNum) {
		boolean isExist = false;
		try {
			isExist = VehicleData.isExist(carNum);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isExist;
	}

	@Override
	public VehicleVO find(String carNum) {
		VehicleVO vo = null;
		VehiclePO po;
		try {
			po = VehicleData.find(carNum);
			vo = new VehicleVO(po.getCarNum(), po.getEngineNum(), po.getCar(), po.getDriver(),po.getBaseNum(), po.getBuyDate(), po.getUseDate(), po.getCarState());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public boolean update(String carNum, TransportState state) {
		boolean success = false;
		try {
			success = VehicleData.updateState(carNum, state);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return success;
	}

}
