package Client.BL_Stub.vehicleBLService_Stub;

import Client.VO.VehicleVO;
import Client.businesslogicservice.vehicleblservice.*;

public class VehicleBlService_Stub implements VehicleBlService{
	
	String carNum;
	String engineNum;
	String car;
	String baseNum;
	String buyDate;
	String useDate; 
	String carState;
	
	public VehicleBlService_Stub(String carNum, String engineNum, String car, String baseNum, String buyDate,
			String useDate, String carState) {
		super();
		this.carNum = carNum;
		this.engineNum = engineNum;
		this.car = car;
		this.baseNum = baseNum;
		this.buyDate = buyDate;
		this.useDate = useDate;
		this.carState = carState;
	}

	@Override
	public void addVehicle(String carNum, String engineNum, String car, String baseNum, String buyData, String useData,
			String carState) {
		System.out.println("新建一个车辆信息！");
	}

	@Override
	public void updateVehicle(String carNum, String engineNum, String car, String baseNum, String buyData,
			String useData, String carState) {
		System.out.println("更新一个车辆信息！");
	}

	@Override
	public void deleteVehicle(String carNum) {
		System.out.println("删除一个车辆信息！");
	}

	@Override
	public void saveVehicle() {
		System.out.println("保存一个车辆信息！");		
	}

	@Override
	public VehicleVO find(String carNum) {
		return new VehicleVO(carNum, engineNum,
		car,baseNum,buyDate,useDate, carState);
	}

}
