package nju.edu.businesslogic.approvebl;

import java.net.InterfaceAddress;
import java.util.ArrayList;

import PO.ArriverorderPO;
import PO.ChangeorderPO;
import PO.LoadorderPO;
import PO.OrderPO;
import PO.PayeeorderPO;
import PO.PayorderPO;
import PO.ReceiveorderPO;
import PO.StoreinorderPO;
import PO.StoreoutorderPO;
import State.ApproveState;
import nju.edu.VO.PayeeorderVO;
import nju.edu.VO.PayorderVO;
import nju.edu.businesslogic.financebl.PayeeorderBL;
import nju.edu.businesslogic.financebl.PayorderBL;
import nju.edu.businesslogic.financebl.checkPayeeOrderInfo;
import nju.edu.businesslogic.financebl.checkPayorderInfo;
import nju.edu.businesslogic.listinbl.ListApprove;
import nju.edu.businesslogic.listinbl.Listinbl;
import nju.edu.businesslogic.loadbl.ApproveLoadInfo;
import nju.edu.businesslogic.loadbl.LoadBL;
import nju.edu.businesslogic.storebl.ApproveWarehouse_inInfo;
import nju.edu.businesslogic.storebl.ApproveWarehouse_outInfo;
import nju.edu.businesslogic.storebl.Warehouse_inBL;
import nju.edu.businesslogic.storebl.Warehouse_outBL;
import nju.edu.businesslogic.transferbl.ApproveReceiFormInfo;
import nju.edu.businesslogic.transferbl.ApproveReceiveInfo;
import nju.edu.businesslogic.transferbl.ApproveTransferInfo;
import nju.edu.businesslogic.transferbl.ReceiFormBL;
import nju.edu.businesslogic.transferbl.ReceiveBL;
import nju.edu.businesslogic.transferbl.TransferBL;
import nju.edu.businesslogicservice.approveblservice.ApproveBLService;

public class Approvebl implements ApproveBLService{
	ListApprove listinbl=new Listinbl();
	ApproveLoadInfo approveLoadInfo=new LoadBL();
	ApproveReceiFormInfo ApproveReceiFormInfo=new ReceiFormBL();
	checkPayeeOrderInfo checkPayeeOrderInfo=new PayeeorderBL();
	ApproveReceiveInfo  approveReceiveInfo=new ReceiveBL();
	ApproveWarehouse_inInfo ApproveWarehouse_inInfo=new Warehouse_inBL();
	ApproveTransferInfo approveTransferInfo=new TransferBL();
	ApproveWarehouse_outInfo ApproveWarehouse_outInfo=new Warehouse_outBL();
	checkPayorderInfo checkPayorderInfo=new PayorderBL();
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
//		}else if(type.equals("派件单")){
//			return receiver();
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
		ArrayList<PayorderVO> arrayList=checkPayorderInfo.checkPayorder();
		ArrayList<String> strings=new ArrayList<>();
		for(int i=0;i<arrayList.size();i++){
			PayorderVO vo=arrayList.get(i);
			String temp=vo.getDate()+";";
			temp+=vo.getMoney()+";";
			temp+=vo.getAccount()+";";
			temp+=vo.getList()+";";
			temp+=vo.getComment()+";";
			temp+=vo.getPayor()+";";
			strings.add(temp);
		}
		return strings;
	}

	private ArrayList<String> storeoutorder() {
		// TODO Auto-generated method stub
		ArrayList<StoreoutorderPO> arrayList=ApproveWarehouse_outInfo.get();
		ArrayList<String> strings=new ArrayList<>();
		for(int i=0;i<arrayList.size();i++){
			StoreoutorderPO po=arrayList.get(i);
			String temp=po.getOrder_number()+";";
			temp+=po.getDate()+";";
			temp+=po.getArrivenum()+";";
			temp+=po.getWay()+";";
			temp+=po.getNumberOfTransport()+";";
			temp+=po.getCheck_state()+";";
			strings.add(temp);
		}
		return strings;
	}

	private ArrayList<String> changeorder() {
		// TODO Auto-generated method stub
		ArrayList<ChangeorderPO> arrayList=approveTransferInfo.get();
		ArrayList<String> strings=new ArrayList<>();
		for(int i=0;i<arrayList.size();i++){
			ChangeorderPO po=arrayList.get(i);
			String temp=po.getDate()+";";
			temp+=po.getNumberOfTransfer()+";";
			temp+=po.getOffnum()+";";
			temp+=po.getArrivenum()+";";
			temp+=po.getWayOfTransport()+";";
			temp+=po.getMonitor()+";";
			temp+=po.getCheck_state()+";";
			strings.add(temp);
		}
		return strings;
	}

	private ArrayList<String> storeinorder() {
		// TODO Auto-generated method stub
		ArrayList<StoreinorderPO>  arrayList=ApproveWarehouse_inInfo.get();
		ArrayList<String> strings=new ArrayList<>();
		for(int i=0;i<arrayList.size();i++){
			StoreinorderPO po=arrayList.get(i);
			String temp=po.getOrder_number()+";";
			temp+=po.getDate()+";";
			temp+=po.getOffnum()+";";
			temp+=po.getQu()+";";
			temp+=po.getPai()+";";
			temp+=po.getJia()+";";
			temp+=po.getWei()+";";
			temp+=po.getCheck_state()+";";
			strings.add(temp);
		}
		return strings;
	}

	private ArrayList<String> arriveorder() {
		// TODO Auto-generated method stub
		ArrayList<ArriverorderPO> arrayList=approveReceiveInfo.get();
		ArrayList<String> strings=new ArrayList<>();
		for(int i=0;i<arrayList.size();i++){
			ArriverorderPO po=arrayList.get(i);
			String temp=po.getNumberOfTransferStation()+";";
			temp+=po.getDate()+";";
			temp+=po.getOffnum()+";";
			temp+=po.getArrive_state()+";";
			temp+=po.getCheck_state()+";";
			strings.add(temp);
		}
		return strings;
	}

//	private ArrayList<String> receiver() {
//		// TODO Auto-generated method stub
//		ArrayList<String> strings=new ArrayList<>();
//		for(int i=0;i<arrayList.size();i++){
//			ReceiveorderPO po=arrayList.get(i);
//			String temp=po.getDate()+";";
//		return null;
//	}

	private ArrayList<String> payeeorder() {
		// TODO Auto-generated method stub
		ArrayList<PayeeorderVO> arrayList=checkPayeeOrderInfo.checkPayeeorder();
		ArrayList<String> strings=new ArrayList<>();
		for(int i=0;i<arrayList.size();i++){
			PayeeorderVO vo=arrayList.get(i);
			String temp=vo.getOrder()+";";
			temp+=vo.getMoney()+";";
			temp+=vo.getDate()+";";
			temp+=vo.getCarrierName()+";";
			temp+=vo.getShopperName()+";";
			temp+=vo.getShop()+";";
			strings.add(temp);
		}
		return strings;
	}

	private ArrayList<String> receiveorder() {
		// TODO Auto-generated method stub
		ArrayList<ReceiveorderPO> arrayList=ApproveReceiFormInfo.get();
		ArrayList<String> strings=new ArrayList<>();
		for(int i=0;i<arrayList.size();i++){
			ReceiveorderPO po=arrayList.get(i);
			String temp=po.getDate()+";";
			temp+=po.getDepartPlace()+";";
			temp+=po.getArrivePlace()+";";
			temp+=po.getArriveState()+";";
			temp+=po.getApproveState()+";";
			strings.add(temp);
		}
		return strings;
	}

	private ArrayList<String> getloadorder() {
		// TODO Auto-generated method stub
		ArrayList<LoadorderPO> arrayList=approveLoadInfo.get();
		ArrayList<String> strings=new ArrayList<>();
		for(int i=0;i<arrayList.size();i++){
			LoadorderPO po=arrayList.get(i);
			String temp=po.getDate()+";";
			temp+=po.getLoadorderNum()+";";
			temp+=po.getTransferNum()+";";
			temp+=po.getArriveNum()+";";
			temp+=po.getMonitorName()+";";
			temp+=po.getTransferName()+";";
			temp+=po.getTransportNum()+";";
			temp+=po.getFee()+";";
			temp+=po.getCheckState()+";";
			strings.add(temp);
		}
//		System.out.print(arrayList.size());
		return strings;
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
			ArrayList<OrderPO> arrayList=listinbl.getAllOrders();
			OrderPO po=arrayList.get(num);
			po.setState(ApproveState.Valid);
			listinbl.changestate(po);
		}else if(type.equals("装车单")){
			ArrayList<LoadorderPO> arrayList=approveLoadInfo.get();
			LoadorderPO po=arrayList.get(num);
			po.setCheckState(ApproveState.Valid);
			approveLoadInfo.save(po);
		}else if(type.equals("营业厅到达单")){
			ArrayList<ReceiveorderPO> arrayList=ApproveReceiFormInfo.get();
			ReceiveorderPO po=arrayList.get(num);
			po.setApproveState(ApproveState.Valid);
			ApproveReceiFormInfo.save(po);
		}else if(type.equals("收款单")){
			ArrayList<PayeeorderVO> arrayList=checkPayeeOrderInfo.checkPayeeorder();
			PayeeorderVO vo=arrayList.get(num);
			PayeeorderPO po=new PayeeorderPO(vo.getOrder(), vo.getMoney(), vo.getDate(), vo.getCarrierName(), vo.getShopperName(), vo.getShop());
			checkPayeeOrderInfo.save(po);
		}else if(type.equals("派件单")){
//			return receiver();
		}else if(type.equals("中转中心到达单")){
			ArrayList<ArriverorderPO> arrayList=approveReceiveInfo.get();
			ArriverorderPO po=arrayList.get(num);
			po.setCheck_state(ApproveState.Valid);
			approveReceiveInfo.save(po);
		}else if(type.equals("入库单")){
			ArrayList<StoreinorderPO> arrayList=ApproveWarehouse_inInfo.get();
			StoreinorderPO po=arrayList.get(num);
			po.setCheck_state(ApproveState.Valid);
			ApproveWarehouse_inInfo.save(po);
		}else if(type.equals("中转单")){
			ArrayList<ChangeorderPO> arrayList=approveTransferInfo.get();
			ChangeorderPO po=arrayList.get(num);
			po.setCheck_state(ApproveState.Valid);
			approveTransferInfo.save(po);
		}else if(type.equals("出库单")){
			ArrayList<StoreoutorderPO> arrayList= ApproveWarehouse_outInfo.get();
			StoreoutorderPO po=arrayList.get(num);
			po.setCheck_state(ApproveState.Valid);
			ApproveWarehouse_outInfo.save(po);
		}else if(type.equals("付款单")){
			ArrayList<PayorderVO> arrayList=checkPayorderInfo.checkPayorder();
			PayorderVO vo=arrayList.get(num);
			PayorderPO po=new PayorderPO(vo.getDate(), vo.getMoney(), vo.getAccount(), vo.getList(), vo.getComment(), vo.getPayor());
			checkPayorderInfo.save(po);
		}
	}

	@Override
	public void endApprove() {
		// TODO Auto-generated method stub
		
	}

}
