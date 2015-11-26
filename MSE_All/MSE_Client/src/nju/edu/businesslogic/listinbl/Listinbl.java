package nju.edu.businesslogic.listinbl;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.OrderVO;
import nju.edu.businesslogicservice.listinblservice.ListinBLService;
import nju.edu.businesslogicservice.listinblservice.OrderInfo;
import nju.edu.businesslogicservice.listinblservice.UpdateInfo;
import nju.edu.dataservice.listindataservice.ListinDataService;
import nju.edu.dataservice.policydataservice.ConstantPolicyDataService;
import nju.edu.businesslogic.checklistbl.ListinInfo;

import java.rmi.RemoteException;

import PO.OrderPO;
import State.ExpressType;
import State.PackageType;

public class Listinbl implements ListinBLService,ListinInfo,OrderInfo,UpdateInfo{
	ListinDataService listinDataService=RMIHelper.getListinData();
	ConstantPolicyDataService ConstantPolicyDataSerivce=RMIHelper.getConstantPolicyData();
	@Override
	public void addOrder(OrderVO vo) {
		// TODO Auto-generated method stub
//		listinDataService.insert(po);
	}

	@Override
	public double getTotalMoney(String address1, String address2, String length, String width, String height, ExpressType express,
			PackageType pack) {
		// TODO Auto-generated method stub
		double result=0;
		//价格部分1：两地之间的距离
		try {
			result=ConstantPolicyDataSerivce.getPrice(address1, address2);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		//部分价格部分2：质量；3：包裹种类；4：快递种类
		result=result+WeightPrice(length, width, height)+PackPrice(pack)+ExpressPrice(express);
		return result;
	}

	protected double PackPrice(PackageType pack) {
		// TODO Auto-generated method stub
		if(pack==PackageType.Carton){
			return 10;
		}else if(pack==PackageType.Wooden){
			return 20;
		}else{
			return 5;
		}
	}

	protected double ExpressPrice(ExpressType express) {
		// TODO Auto-generated method stub
		if(express==ExpressType.Economy){
			return 10;
		}else if(express==ExpressType.Standard){
			return 25;
		}else{
			return 50;
		}

	}

	protected double WeightPrice(String l, String w, String h) {
		// TODO Auto-generated method stub
		Double length=Double.parseDouble(l);
		Double width=Double.parseDouble(w);
		Double height=Double.parseDouble(h);
		if(length*width*height>50000){
			return length*width*height/5000;
		}else{
			return 20;
		}
	}

	@Override
	public String getTotalTime(String address1, String address2, ExpressType express) {
		// TODO Auto-generated method stub
		return null;
	}

	//是否要在data层分离接口
	@Override
	public OrderVO getOrder(String id) {
		// TODO Auto-generated method stub
		listinDataService.getOrder(id);
		return 	null;
	}

	@Override
	public void update(String id, String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getWeight(String id) {
		return 0;
		// TODO Auto-generated method stub
		
	}

}
