package nju.edu.businesslogic.approvebl;

import java.util.ArrayList;

import PO.OrderPO;
import nju.edu.businesslogic.listinbl.Listinbl;
import nju.edu.businesslogicservice.approveblservice.ApproveBLService;

public class Approvebl implements ApproveBLService{
	Listinbl listinbl=new Listinbl();
	@Override
	public ArrayList<String> showList(String type) {
		// TODO Auto-generated method stub
		if(type.equals("寄件单")){
			return getorder();
		}else if(type.equals("装车单")){
			return getloadorder();
		}else if(type.equals("营业厅到达单")){
			return receiveorder();
		}else if(type.equals("收款单")){
			return payeeorder();
		}else if(type.equals("派件单")){
			return receiver();
		}else if(type.equals("中转中心到达单")){
			return arriveorder();
		}else if(type.equals("入库单")){
			return storeinorder();
		}else if(type.equals("中转单")){
			return changeorder();
		}else if(type.equals("出库单")){
			return storeoutorder();
		}else if(type.equals("付款单")){
			return payorder();
		}
		return null;
	}

	private ArrayList<String> payorder() {
		// TODO Auto-generated method stub
		return null;
	}

	private ArrayList<String> storeoutorder() {
		// TODO Auto-generated method stub
		return null;
	}

	private ArrayList<String> changeorder() {
		// TODO Auto-generated method stub
		return null;
	}

	private ArrayList<String> storeinorder() {
		// TODO Auto-generated method stub
		return null;
	}

	private ArrayList<String> arriveorder() {
		// TODO Auto-generated method stub
		return null;
	}

	private ArrayList<String> receiver() {
		// TODO Auto-generated method stub
		return null;
	}

	private ArrayList<String> payeeorder() {
		// TODO Auto-generated method stub
		return null;
	}

	private ArrayList<String> receiveorder() {
		// TODO Auto-generated method stub
		return null;
	}

	private ArrayList<String> getloadorder() {
		// TODO Auto-generated method stub
		return null;
	}

	private ArrayList<String> getorder() {
		// TODO Auto-generated method stub
		ArrayList<OrderPO> pos=listinbl.getAllOrders();
		ArrayList<String> strings=new ArrayList<String>();
		for(int i=0;i<pos.size();i++){
			OrderPO po=pos.get(i);
			String temp="";
			temp+=po.getCourier()+";";
			temp+=po.getId()+";";
			temp+=po.getState()+";";
			temp+=po.getSender()+";";
			temp+=po.getAddress1()+";";
			temp+=po.getPhone1()+";";
			temp+=po.getCellphone1()+";";
			temp+=po.getPosition1()+";";
			temp+=po.getReceiver()+";";
			temp+=po.getAddress2()+";";
			temp+=po.getPhone2()+";";
			temp+=po.getCellphone2()+";";
			temp+=po.getPosition2()+";";
			temp+=po.getItems()+";";
			temp+=po.getCount()+";";
			temp+=po.getWeight()+";";
			temp+=po.getLength()+";";
			temp+=po.getWidth()+";";
			temp+=po.getHeight()+";";
			temp+=po.getExpress()+";";
			temp+=po.getPack()+";";
			temp+=po.getBill()+";";
			temp+=po.getTime()+";";
			temp+=po.getTransformState()+";";
			strings.add(temp);
		}
		return strings;
	}

	@Override
	public <T> T checkList(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editList(int num,String type) {
		// TODO Auto-generated method stub
		if(type.equals("寄件单")){
			listinbl.changestate(num);
		}else if(type.equals("装车单")){
//			return getloadorder();
		}else if(type.equals("营业厅到达单")){
//			return receiveorder();
		}else if(type.equals("收款单")){
//			return payeeorder();
		}else if(type.equals("派件单")){
//			return receiver();
		}else if(type.equals("中转中心到达单")){
//			return arriveorder();
		}else if(type.equals("入库单")){
//			return storeinorder();
		}else if(type.equals("中转单")){
//			return changeorder();
		}else if(type.equals("出库单")){
//			return storeoutorder();
		}else if(type.equals("付款单")){
//			return payorder();
		}
	}

	@Override
	public void endApprove() {
		// TODO Auto-generated method stub
		
	}

}
