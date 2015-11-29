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
import java.util.Calendar;

import PO.OrderPO;
import State.ExpressType;
import State.PackageType;

public class Listinbl implements ListinBLService,ListinInfo,OrderInfo,UpdateInfo{
	ListinDataService listinDataService=RMIHelper.getListinData();
	ConstantPolicyDataService ConstantPolicyDataSerivce=RMIHelper.getConstantPolicyData();
	@Override
	public void addOrder(OrderVO vo) {
		// TODO Auto-generated method stub
		OrderPO po=new OrderPO(vo.getCourier(), vo.getId(), vo.getState(), vo.getSender(), vo.getAddress1(), vo.getPosition1(), vo.getPhone1(), vo.getCellphone1(), vo.getReceiver(), vo.getAddress2(), vo.getPosition2(), vo.getPhone2(), vo.getCellphone2(), vo.getItems(), vo.getCount(), vo.getWeight(), vo.getLength(), vo.getWidth(), vo.getHeight(), vo.getExpress(), vo.getPack(), vo.getBill(), vo.getTime(), vo.getTransformState());
		try {
			listinDataService.insert(po);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public double getTotalMoney(String address1, String address2, String length, String width, String height, ExpressType express,
			PackageType pack) {
		// TODO Auto-generated method stub
		double result=0;
		//价格部分1：两地之间的距离*单价
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
		double distance=0;
		try {
			distance=ConstantPolicyDataSerivce.GetDistance(address1, address2);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double speed=80;
		return (int)(distance/80/24)+"天"+((int)(distance/80)-(int)(distance/80/24)*24)+"小时";
	}

	//是否要在data层分离接口
	@Override
	public OrderVO getOrder(String id) {
		// TODO Auto-generated method stub
		OrderVO vo=null;
		OrderPO po;
		try {
			po = listinDataService.getOrder(id);
			vo=new OrderVO(po.getCourier(), po.getId(), po.getState(),
					po.getSender(), po.getAddress1(), po.getPosition1(), po.getPhone1(), po.getCellphone1(),
					po.getReceiver(), po.getAddress2(), po.getPosition2(), po.getPhone2(), po.getCellphone2(), 
					po.getItems(), po.getCount()+"", po.getWeight()+"", po.getLength()+"", po.getWidth()+"", po.getHeight()+"", 
					po.getExpress(), po.getPack(), po.getTime(), po.getBill()+"", po.getTransformState());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 	vo;
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

	@Override
	public boolean JudgeNull(OrderVO vo) {
		// TODO Auto-generated method stub
		boolean result=true;
		if (vo.getCourier().equals("")||vo.getId().equals("")||
				vo.getSender().equals("")||vo.getAddress1().equals("")||vo.getPhone1().equals("")||vo.getCellphone1().equals("")||
				vo.getReceiver().equals("")||vo.getAddress2().equals("")||vo.getPhone2().equals("")||vo.getCellphone2().equals("")||
				vo.getItems().equals("")||vo.getCount()<0||vo.getWeight()<0||vo.getLength()<0||vo.getWidth()<0||vo.getHeight()<0||
				vo.getExpress()==null||vo.getPack()==null||vo.getBill()<0
				) {
			result=false;
			return result;
		}
		return result;
	}

}
