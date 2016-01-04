package nju.edu.businesslogic.approvebl;

import java.util.ArrayList;

import PO.ArriverorderPO;
import PO.ChangeorderPO;
import PO.LoadorderPO;
import PO.OrderPO;
import PO.PayeeorderPO;
import PO.PayorderPO;
import PO.ReceiveorderPO;
import PO.SendorderPO;
import PO.StoreinorderPO;
import PO.StoreoutorderPO;
import State.ApproveState;
import nju.edu.VO.PayeeorderVO;
import nju.edu.VO.PayorderVO;
import nju.edu.VO.SendorderVO;
import nju.edu.businesslogic.financebl.PayeeorderBL;
import nju.edu.businesslogic.financebl.PayorderBL;
import nju.edu.businesslogic.financebl.checkPayeeOrderInfo;
import nju.edu.businesslogic.financebl.checkPayorderInfo;
import nju.edu.businesslogic.listinbl.Listinbl;
import nju.edu.businesslogic.loadbl.ApproveLoadInfo;
import nju.edu.businesslogic.loadbl.LoadBL;
import nju.edu.businesslogic.storebl.ApproveWarehouse_inInfo;
import nju.edu.businesslogic.storebl.ApproveWarehouse_outInfo;
import nju.edu.businesslogic.storebl.Warehouse_inBL;
import nju.edu.businesslogic.storebl.Warehouse_outBL;
import nju.edu.businesslogic.transferbl.ApproveReceiFormInfo;
import nju.edu.businesslogic.transferbl.ApproveReceiveInfo;
import nju.edu.businesslogic.transferbl.ApproveSendFormInfo;
import nju.edu.businesslogic.transferbl.ApproveTransferInfo;
import nju.edu.businesslogic.transferbl.ReceiFormBL;
import nju.edu.businesslogic.transferbl.ReceiveBL;
import nju.edu.businesslogic.transferbl.SendFormBL;
import nju.edu.businesslogic.transferbl.TransferBL;
import nju.edu.businesslogicservice.approveblservice.ApproveBLService;
import nju.edu.businesslogicservice.listinblservice.ListApprove;

public class Approvebl implements ApproveBLService {
	ListApprove listinbl = new Listinbl();
	ApproveLoadInfo approveLoadInfo = new LoadBL();
	ApproveReceiFormInfo ApproveReceiFormInfo = new ReceiFormBL();
	checkPayeeOrderInfo checkPayeeOrderInfo = new PayeeorderBL();
	ApproveReceiveInfo approveReceiveInfo = new ReceiveBL();
	ApproveWarehouse_inInfo ApproveWarehouse_inInfo = new Warehouse_inBL();
	ApproveTransferInfo approveTransferInfo = new TransferBL();
	ApproveWarehouse_outInfo ApproveWarehouse_outInfo = new Warehouse_outBL();
	checkPayorderInfo checkPayorderInfo = new PayorderBL();
	ApproveSendFormInfo ApproveSendFormInfo = new SendFormBL();

	@Override
	public ArrayList<String> showList(String type) {
		// TODO Auto-generated method stub
		if (type.equals("寄件单")) {
			return getorder();
		} else if (type.equals("装车单")) {
			return getloadorder();
		} else if (type.equals("营业厅到达单")) {
			return receiveorder();
		} else if (type.equals("收款单")) {
			return payeeorder();
		} else if (type.equals("派件单")) {
			return receiver();
		} else if (type.equals("中转中心到达单")) {
			return arriveorder();
		} else if (type.equals("入库单")) {
			return storeinorder();
		} else if (type.equals("中转单")) {
			return changeorder();
		} else if (type.equals("出库单")) {
			return storeoutorder();
		} else if (type.equals("付款单")) {
			return payorder();
		}
		return null;
	}

	private ArrayList<String> payorder() {
		// TODO Auto-generated method stub
		ArrayList<PayorderVO> arrayList = checkPayorderInfo
				.checkUncheckedPayorder();
		ArrayList<String> strings = new ArrayList<>();
		if(arrayList!=null){
			for (int i = 0; i < arrayList.size(); i++) {
				PayorderVO vo = arrayList.get(i);
				String temp = "时间" + ":" + vo.getDate() + ";" + '\n';
				temp += "金额" + ":" + vo.getMoney() + ";" + '\n';
				temp += "账户" + ":" + vo.getAccount() + ";" + '\n';
				temp += "列表" + ":" + vo.getList() + ";" + '\n';
				temp += "备注" + ":" + vo.getComment() + ";" + '\n';
				temp += "付款人" + ":" + vo.getPayor() + ";" + '\n';
				strings.add(temp);
			}
		}
		return strings;
	}

	private ArrayList<String> storeoutorder() {
		// TODO Auto-generated method stub
		ArrayList<StoreoutorderPO> arrayList = ApproveWarehouse_outInfo.get();
		ArrayList<String> strings = new ArrayList<>();
		if(arrayList!=null){
			for (int i = 0; i < arrayList.size(); i++) {
				StoreoutorderPO po = arrayList.get(i);
				String temp = "订单号" + ":" + po.getOrder_number() + ";" + '\n';
				temp += "时间" + ":" + po.getDate() + ";" + '\n';
				temp += "到达数量" + ":" + po.getArrivenum() + ";" + '\n';
				temp += "运输方式" + ":" + po.getWay() + ";" + '\n';
				temp += "运输编号" + ":" + po.getNumberOfTransport() + ";" + '\n';
				temp += "审批状态" + ":" + po.getCheck_state() + ";" + '\n';
				strings.add(temp);
			}
		}
		return strings;
	}

	private ArrayList<String> changeorder() {
		// TODO Auto-generated method stub
		ArrayList<ChangeorderPO> arrayList = approveTransferInfo.get();
		ArrayList<String> strings = new ArrayList<>();
		if(arrayList!=null){
			for (int i = 0; i < arrayList.size(); i++) {
				ChangeorderPO po = arrayList.get(i);
				String temp = "时间" + ":" + po.getDate() + ";" + '\n';
				temp += "中转中心中转单编号" + ":" + po.getNumberOfTransfer() + ";" + '\n';
				temp += "出发地" + ":" + po.getOffnum() + ";" + '\n';
				temp += "到达地" + ":" + po.getArrivenum() + ";" + '\n';
				temp += "装运方式" + ":" + po.getWayOfTransport() + ";" + '\n';
				temp += "监装员 " + ":" + po.getMonitor() + ";" + '\n';
				temp += "审批状态 " + ":" + po.getCheck_state() + ";" + '\n';
				strings.add(temp);
			}
		}
		return strings;
	}

	private ArrayList<String> storeinorder() {
		// TODO Auto-generated method stub
		ArrayList<StoreinorderPO> arrayList = ApproveWarehouse_inInfo.get();
		ArrayList<String> strings = new ArrayList<>();
		if(arrayList!=null){
			for (int i = 0; i < arrayList.size(); i++) {
				StoreinorderPO po = arrayList.get(i);
				String temp = "快递编号" + ":" + po.getOrder_number() + ";" + '\n';
				temp += "入库日期 " + ":" + po.getDate() + ";" + '\n';
				temp += "目的地 " + ":" + po.getOffnum() + ";" + '\n';
				temp += "区号" + ":" + po.getQu() + ";" + '\n';
				temp += "排号" + ":" + po.getPai() + ";" + '\n';
				temp += "架号" + ":" + po.getJia() + ";" + '\n';
				temp += "位号" + ":" + po.getWei() + ";" + '\n';
				temp += "审批状态 " + ":" + po.getCheck_state() + ";" + '\n';
				strings.add(temp);
			}
		}
		return strings;
	}

	private ArrayList<String> arriveorder() {
		// TODO Auto-generated method stub
		ArrayList<ArriverorderPO> arrayList = approveReceiveInfo.get();
		ArrayList<String> strings = new ArrayList<>();
		if(arrayList!=null){
			for (int i = 0; i < arrayList.size(); i++) {
				ArriverorderPO po = arrayList.get(i);
				String temp = "中转中心编号" + ":" + po.getNumberOfTransferStation()
						+ ";" + '\n';
				temp += "到达日期" + ":" + po.getDate() + ";" + '\n';
				temp += "出发地" + ":" + po.getOffnum() + ";" + '\n';
				temp += "货物到达状态" + ":" + po.getArrive_state() + ";" + '\n';
				temp += "审批状态" + ":" + po.getCheck_state() + ";" + '\n';
				strings.add(temp);
			}
		}
		return strings;
	}

	private ArrayList<String> receiver() {
		// TODO Auto-generated method stub
		ArrayList<SendorderPO> arrayList = ApproveSendFormInfo.get();
		ArrayList<String> strings = new ArrayList<>();
		if(arrayList!=null){
			for (int i = 0; i < arrayList.size(); i++) {
				SendorderPO po = arrayList.get(i);
				String temp = "时间" + ":" + po.getDate() + ";" + '\n';
				temp += "派件人" + ":" + po.getSender() + ";" + '\n';
				temp += "审批状态" + ":" + po.getApprovestate() + ";" + '\n';
				strings.add(temp);
			}
		}
		return strings;
	}

	private ArrayList<String> payeeorder() {
		// TODO Auto-generated method stub
		ArrayList<PayeeorderVO> arrayList = checkPayeeOrderInfo
				.checkUncheckedPayeeorder();
		ArrayList<String> strings = new ArrayList<>();
		if(arrayList!=null){
			for (int i = 0; i < arrayList.size(); i++) {
				PayeeorderVO vo = arrayList.get(i);
				String temp = "付款单" + ":" + vo.getOrder() + ";" + '\n';
				temp += "金额" + ":" + vo.getMoney() + ";" + '\n';
				temp += "时间" + ":" + vo.getDate() + ";" + '\n';
				temp += "收件人" + ":" + vo.getCarrierName() + ";" + '\n';
				temp += "营业厅业务员" + ":" + vo.getShopperName() + ";" + '\n';
				temp += "营业厅" + ":" + vo.getShop() + ";" + '\n';
				strings.add(temp);
			}
		}
		return strings;
	}

	private ArrayList<String> receiveorder() {
		// TODO Auto-generated method stub
		ArrayList<ReceiveorderPO> arrayList = ApproveReceiFormInfo.get();
		ArrayList<String> strings = new ArrayList<>();
		if(arrayList!=null){
			for (int i = 0; i < arrayList.size(); i++) {
				ReceiveorderPO po = arrayList.get(i);
				String temp = "到达日期" + ":" + po.getDate() + ";" + '\n';
				temp += "出发地" + ":" + po.getDepartPlace() + ";" + '\n';
				temp += "到达地" + ":" + po.getArrivePlace() + ";" + '\n';
				temp += "到达状态" + ":" + po.getArriveState() + ";" + '\n';
				temp += "审批状态" + ":" + po.getApproveState() + ";" + '\n';
				strings.add(temp);
			}
		}
		return strings;
	}

	private ArrayList<String> getloadorder() {
		// TODO Auto-generated method stub
		ArrayList<LoadorderPO> arrayList = approveLoadInfo.get();
		ArrayList<String> strings = new ArrayList<>();
		if(arrayList!=null){
			for (int i = 0; i < arrayList.size(); i++) {
				LoadorderPO po = arrayList.get(i);
				String temp = "装运日期" + ":" + po.getDate() + ";" + '\n';
				temp += "装运单编号" + ":" + po.getLoadorderNum() + ";" + '\n';
				temp += "中转中心编号或营业厅编号" + ":" + po.getTransferNum() + ";" + '\n';
				temp += "到达地编号" + ":" + po.getArriveNum() + ";" + '\n';
				temp += "监装员姓名" + ":" + po.getMonitorName() + ";" + '\n';
				temp += "押运员姓名 " + ":" + po.getTransferName() + ";" + '\n';
				temp += "运输编号" + ":" + po.getTransportNum() + ";" + '\n';
				temp += "运费 " + ":" + po.getFee() + ";" + '\n';
				temp += "审批状态" + ":" + po.getCheckState() + ";" + '\n';
				strings.add(temp);
			}
		}
		return strings;
	}

	private ArrayList<String> getorder() {
		// TODO Auto-generated method stub
		ArrayList<OrderPO> pos = listinbl.getAllOrders();
		ArrayList<String> strings = new ArrayList<String>();
		if(pos!=null){
			for (int i = 0; i < pos.size(); i++) {
				OrderPO po = pos.get(i);
				String temp = "";
				temp += "快递员" + ":" + po.getCourier() + ";" + '\n';
				temp += "订单号" + ":" + po.getId() + ";" + '\n';
				temp += "状态" + ":" + po.getState() + ";" + '\n';
				temp += "寄件人" + ":" + po.getSender() + ";" + '\n';
				temp += "寄件人地址" + ":" + po.getAddress1() + ";" + '\n';
				temp += "寄件人电话" + ":" + po.getPhone1() + ";" + '\n';
				temp += "寄件人手机" + ":" + po.getCellphone1() + ";" + '\n';
				temp += "寄件人单位" + ":" + po.getPosition1() + ";" + '\n';
				temp += "收件人" + ":" + po.getReceiver() + ";" + '\n';
				temp += "收件人地址" + ":" + po.getAddress2() + ";" + '\n';
				temp += "收件人电话" + ":" + po.getPhone2() + ";" + '\n';
				temp += "收件人手机" + ":" + po.getCellphone2() + ";" + '\n';
				temp += "收件人单位" + ":" + po.getPosition2() + ";" + '\n';
				temp += "寄件" + ":" + po.getItems() + ";" + '\n';
				temp += "寄件数" + ":" + po.getCount() + ";" + '\n';
				temp += "质量(kg)" + ":" + po.getWeight() + ";" + '\n';
				temp += "长(cm)" + ":" + po.getLength() + ";" + '\n';
				temp += "宽(cm)" + ":" + po.getWidth() + ";" + '\n';
				temp += "高(cm)" + ":" + po.getHeight() + ";" + '\n';
				temp += "快递类型" + ":" + po.getExpress() + ";" + '\n';
				temp += "包裹类型" + ":" + po.getPack() + ";" + '\n';
				temp += "付款" + ":" + po.getBill() + ";" + '\n';
				temp += "预计所需时间" + ":" + po.getTime() + ";" + '\n';
				temp += "运输状况" + ":" + po.getTransformState() + ";" + '\n';
				strings.add(temp);
			}
		}
		return strings;
	}

	@Override
	public void editList(int num, String type) {
		// TODO Auto-generated method stub
		if (type.equals("寄件单")) {
			ArrayList<OrderPO> arrayList = listinbl.getAllOrders();
			OrderPO po = arrayList.get(num);
			po.setState(ApproveState.Valid);
			listinbl.changestate(po);
		} else if (type.equals("装车单")) {
			ArrayList<LoadorderPO> arrayList = approveLoadInfo.get();
			LoadorderPO po = arrayList.get(num);
			po.setCheckState(ApproveState.Valid);
			approveLoadInfo.save(po);
		} else if (type.equals("营业厅到达单")) {
			ArrayList<ReceiveorderPO> arrayList = ApproveReceiFormInfo.get();
			ReceiveorderPO po = arrayList.get(num);
			po.setApproveState(ApproveState.Valid);
			ApproveReceiFormInfo.save(po);
		} else if (type.equals("收款单")) {
			ArrayList<PayeeorderVO> arrayList = checkPayeeOrderInfo
					.checkUncheckedPayeeorder();
			PayeeorderVO vo = arrayList.get(num);
			PayeeorderPO po = new PayeeorderPO(vo.getOrder(), vo.getMoney(),
					vo.getDate(), vo.getCarrierName(), vo.getShopperName(),
					vo.getShop());
			po.setState(ApproveState.Valid);
			checkPayeeOrderInfo.save(po);
		} else if (type.equals("派件单")) {
			ArrayList<SendorderPO> arrayList = ApproveSendFormInfo.get();
			SendorderPO po = arrayList.get(num);
			po.setApprovestate(ApproveState.Valid);
			ApproveSendFormInfo.save(po);
		} else if (type.equals("中转中心到达单")) {
			ArrayList<ArriverorderPO> arrayList = approveReceiveInfo.get();
			ArriverorderPO po = arrayList.get(num);
			po.setCheck_state(ApproveState.Valid);
			approveReceiveInfo.save(po);
		} else if (type.equals("入库单")) {
			ArrayList<StoreinorderPO> arrayList = ApproveWarehouse_inInfo.get();
			StoreinorderPO po = arrayList.get(num);
			po.setCheck_state(ApproveState.Valid);
			ApproveWarehouse_inInfo.save(po);
		} else if (type.equals("中转单")) {
			ArrayList<ChangeorderPO> arrayList = approveTransferInfo.get();
			ChangeorderPO po = arrayList.get(num);
			po.setCheck_state(ApproveState.Valid);
			approveTransferInfo.save(po);
		} else if (type.equals("出库单")) {
			ArrayList<StoreoutorderPO> arrayList = ApproveWarehouse_outInfo
					.get();
			StoreoutorderPO po = arrayList.get(num);
			po.setCheck_state(ApproveState.Valid);
			ApproveWarehouse_outInfo.save(po);
		} else if (type.equals("付款单")) {
			ArrayList<PayorderVO> arrayList = checkPayorderInfo
					.checkUncheckedPayorder();
			PayorderVO vo = arrayList.get(num);
			PayorderPO po = new PayorderPO(vo.getDate(), vo.getMoney(),
					vo.getAccount(), vo.getList(), vo.getComment(),
					vo.getPayor());
			po.setState(ApproveState.Valid);
			checkPayorderInfo.save(po);
		}
	}

}
