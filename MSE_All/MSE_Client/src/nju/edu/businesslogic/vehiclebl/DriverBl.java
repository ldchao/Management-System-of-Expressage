package nju.edu.businesslogic.vehiclebl;

import PO.DriverPO;
import State.DriverState;
import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.DriverVO;
import nju.edu.businesslogicservice.vehicleblservice.DriverBlService;
import nju.edu.dataservice.vehicledataservice.DriverDataService;

public class DriverBl implements DriverBlService,driverUpdateInfo{
	DriverDataService DriverData = RMIHelper.getDriverData();

	@Override
	public void addDriver(DriverVO vo) {
		DriverPO po = new DriverPO(vo.getDriverNum(), vo.getName(), vo.getShopNum(), vo.getBirthDate(), vo.getIdNum(), vo.getPhoneNum(), vo.getSex(), vo.getLicenseDue(), vo.getDriverState());
		try {
			DriverData.insert(po);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateDriver(DriverVO vo) {
		DriverPO po = new DriverPO(vo.getDriverNum(), vo.getName(), vo.getShopNum(), vo.getBirthDate(), vo.getIdNum(), vo.getPhoneNum(), vo.getSex(), vo.getLicenseDue(), vo.getDriverState());
		try {
			DriverData.update(po);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteDriver(String name) {
		try {
			DriverData.delete(DriverData.find(name));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean searchDriver(String name) {
		boolean isExist = false;
		try {
			isExist = DriverData.isExist(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isExist;
	}

	@Override
	public DriverVO find(String name) {
		DriverVO vo = null;
		DriverPO po;
		try {
			po = DriverData.find(name);
			vo = new DriverVO(po.getDriverNum(), po.getName(), po.getShopNum(), po.getBirthDate(), po.getIdNum(), po.getPhoneNum(), po.getSex(), po.getLicenseDue(), po.getDriverState());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}

	@Override
	public boolean update(String name, DriverState state) {
		boolean success = false;
		try {
			success = DriverData.updateState(name, state);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return success;
	}

}
