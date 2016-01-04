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
		if (type.equals("�ļ���")) {
			return getorder();
		} else if (type.equals("װ����")) {
			return getloadorder();
		} else if (type.equals("Ӫҵ�����ﵥ")) {
			return receiveorder();
		} else if (type.equals("�տ")) {
			return payeeorder();
		} else if (type.equals("�ɼ���")) {
			return receiver();
		} else if (type.equals("��ת���ĵ��ﵥ")) {
			return arriveorder();
		} else if (type.equals("��ⵥ")) {
			return storeinorder();
		} else if (type.equals("��ת��")) {
			return changeorder();
		} else if (type.equals("���ⵥ")) {
			return storeoutorder();
		} else if (type.equals("���")) {
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
				String temp = "ʱ��" + ":" + vo.getDate() + ";" + '\n';
				temp += "���" + ":" + vo.getMoney() + ";" + '\n';
				temp += "�˻�" + ":" + vo.getAccount() + ";" + '\n';
				temp += "�б�" + ":" + vo.getList() + ";" + '\n';
				temp += "��ע" + ":" + vo.getComment() + ";" + '\n';
				temp += "������" + ":" + vo.getPayor() + ";" + '\n';
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
				String temp = "������" + ":" + po.getOrder_number() + ";" + '\n';
				temp += "ʱ��" + ":" + po.getDate() + ";" + '\n';
				temp += "��������" + ":" + po.getArrivenum() + ";" + '\n';
				temp += "���䷽ʽ" + ":" + po.getWay() + ";" + '\n';
				temp += "������" + ":" + po.getNumberOfTransport() + ";" + '\n';
				temp += "����״̬" + ":" + po.getCheck_state() + ";" + '\n';
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
				String temp = "ʱ��" + ":" + po.getDate() + ";" + '\n';
				temp += "��ת������ת�����" + ":" + po.getNumberOfTransfer() + ";" + '\n';
				temp += "������" + ":" + po.getOffnum() + ";" + '\n';
				temp += "�����" + ":" + po.getArrivenum() + ";" + '\n';
				temp += "װ�˷�ʽ" + ":" + po.getWayOfTransport() + ";" + '\n';
				temp += "��װԱ " + ":" + po.getMonitor() + ";" + '\n';
				temp += "����״̬ " + ":" + po.getCheck_state() + ";" + '\n';
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
				String temp = "��ݱ��" + ":" + po.getOrder_number() + ";" + '\n';
				temp += "������� " + ":" + po.getDate() + ";" + '\n';
				temp += "Ŀ�ĵ� " + ":" + po.getOffnum() + ";" + '\n';
				temp += "����" + ":" + po.getQu() + ";" + '\n';
				temp += "�ź�" + ":" + po.getPai() + ";" + '\n';
				temp += "�ܺ�" + ":" + po.getJia() + ";" + '\n';
				temp += "λ��" + ":" + po.getWei() + ";" + '\n';
				temp += "����״̬ " + ":" + po.getCheck_state() + ";" + '\n';
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
				String temp = "��ת���ı��" + ":" + po.getNumberOfTransferStation()
						+ ";" + '\n';
				temp += "��������" + ":" + po.getDate() + ";" + '\n';
				temp += "������" + ":" + po.getOffnum() + ";" + '\n';
				temp += "���ﵽ��״̬" + ":" + po.getArrive_state() + ";" + '\n';
				temp += "����״̬" + ":" + po.getCheck_state() + ";" + '\n';
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
				String temp = "ʱ��" + ":" + po.getDate() + ";" + '\n';
				temp += "�ɼ���" + ":" + po.getSender() + ";" + '\n';
				temp += "����״̬" + ":" + po.getApprovestate() + ";" + '\n';
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
				String temp = "���" + ":" + vo.getOrder() + ";" + '\n';
				temp += "���" + ":" + vo.getMoney() + ";" + '\n';
				temp += "ʱ��" + ":" + vo.getDate() + ";" + '\n';
				temp += "�ռ���" + ":" + vo.getCarrierName() + ";" + '\n';
				temp += "Ӫҵ��ҵ��Ա" + ":" + vo.getShopperName() + ";" + '\n';
				temp += "Ӫҵ��" + ":" + vo.getShop() + ";" + '\n';
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
				String temp = "��������" + ":" + po.getDate() + ";" + '\n';
				temp += "������" + ":" + po.getDepartPlace() + ";" + '\n';
				temp += "�����" + ":" + po.getArrivePlace() + ";" + '\n';
				temp += "����״̬" + ":" + po.getArriveState() + ";" + '\n';
				temp += "����״̬" + ":" + po.getApproveState() + ";" + '\n';
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
				String temp = "װ������" + ":" + po.getDate() + ";" + '\n';
				temp += "װ�˵����" + ":" + po.getLoadorderNum() + ";" + '\n';
				temp += "��ת���ı�Ż�Ӫҵ�����" + ":" + po.getTransferNum() + ";" + '\n';
				temp += "����ر��" + ":" + po.getArriveNum() + ";" + '\n';
				temp += "��װԱ����" + ":" + po.getMonitorName() + ";" + '\n';
				temp += "Ѻ��Ա���� " + ":" + po.getTransferName() + ";" + '\n';
				temp += "������" + ":" + po.getTransportNum() + ";" + '\n';
				temp += "�˷� " + ":" + po.getFee() + ";" + '\n';
				temp += "����״̬" + ":" + po.getCheckState() + ";" + '\n';
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
				temp += "���Ա" + ":" + po.getCourier() + ";" + '\n';
				temp += "������" + ":" + po.getId() + ";" + '\n';
				temp += "״̬" + ":" + po.getState() + ";" + '\n';
				temp += "�ļ���" + ":" + po.getSender() + ";" + '\n';
				temp += "�ļ��˵�ַ" + ":" + po.getAddress1() + ";" + '\n';
				temp += "�ļ��˵绰" + ":" + po.getPhone1() + ";" + '\n';
				temp += "�ļ����ֻ�" + ":" + po.getCellphone1() + ";" + '\n';
				temp += "�ļ��˵�λ" + ":" + po.getPosition1() + ";" + '\n';
				temp += "�ռ���" + ":" + po.getReceiver() + ";" + '\n';
				temp += "�ռ��˵�ַ" + ":" + po.getAddress2() + ";" + '\n';
				temp += "�ռ��˵绰" + ":" + po.getPhone2() + ";" + '\n';
				temp += "�ռ����ֻ�" + ":" + po.getCellphone2() + ";" + '\n';
				temp += "�ռ��˵�λ" + ":" + po.getPosition2() + ";" + '\n';
				temp += "�ļ�" + ":" + po.getItems() + ";" + '\n';
				temp += "�ļ���" + ":" + po.getCount() + ";" + '\n';
				temp += "����(kg)" + ":" + po.getWeight() + ";" + '\n';
				temp += "��(cm)" + ":" + po.getLength() + ";" + '\n';
				temp += "��(cm)" + ":" + po.getWidth() + ";" + '\n';
				temp += "��(cm)" + ":" + po.getHeight() + ";" + '\n';
				temp += "�������" + ":" + po.getExpress() + ";" + '\n';
				temp += "��������" + ":" + po.getPack() + ";" + '\n';
				temp += "����" + ":" + po.getBill() + ";" + '\n';
				temp += "Ԥ������ʱ��" + ":" + po.getTime() + ";" + '\n';
				temp += "����״��" + ":" + po.getTransformState() + ";" + '\n';
				strings.add(temp);
			}
		}
		return strings;
	}

	@Override
	public void editList(int num, String type) {
		// TODO Auto-generated method stub
		if (type.equals("�ļ���")) {
			ArrayList<OrderPO> arrayList = listinbl.getAllOrders();
			OrderPO po = arrayList.get(num);
			po.setState(ApproveState.Valid);
			listinbl.changestate(po);
		} else if (type.equals("װ����")) {
			ArrayList<LoadorderPO> arrayList = approveLoadInfo.get();
			LoadorderPO po = arrayList.get(num);
			po.setCheckState(ApproveState.Valid);
			approveLoadInfo.save(po);
		} else if (type.equals("Ӫҵ�����ﵥ")) {
			ArrayList<ReceiveorderPO> arrayList = ApproveReceiFormInfo.get();
			ReceiveorderPO po = arrayList.get(num);
			po.setApproveState(ApproveState.Valid);
			ApproveReceiFormInfo.save(po);
		} else if (type.equals("�տ")) {
			ArrayList<PayeeorderVO> arrayList = checkPayeeOrderInfo
					.checkUncheckedPayeeorder();
			PayeeorderVO vo = arrayList.get(num);
			PayeeorderPO po = new PayeeorderPO(vo.getOrder(), vo.getMoney(),
					vo.getDate(), vo.getCarrierName(), vo.getShopperName(),
					vo.getShop());
			po.setState(ApproveState.Valid);
			checkPayeeOrderInfo.save(po);
		} else if (type.equals("�ɼ���")) {
			ArrayList<SendorderPO> arrayList = ApproveSendFormInfo.get();
			SendorderPO po = arrayList.get(num);
			po.setApprovestate(ApproveState.Valid);
			ApproveSendFormInfo.save(po);
		} else if (type.equals("��ת���ĵ��ﵥ")) {
			ArrayList<ArriverorderPO> arrayList = approveReceiveInfo.get();
			ArriverorderPO po = arrayList.get(num);
			po.setCheck_state(ApproveState.Valid);
			approveReceiveInfo.save(po);
		} else if (type.equals("��ⵥ")) {
			ArrayList<StoreinorderPO> arrayList = ApproveWarehouse_inInfo.get();
			StoreinorderPO po = arrayList.get(num);
			po.setCheck_state(ApproveState.Valid);
			ApproveWarehouse_inInfo.save(po);
		} else if (type.equals("��ת��")) {
			ArrayList<ChangeorderPO> arrayList = approveTransferInfo.get();
			ChangeorderPO po = arrayList.get(num);
			po.setCheck_state(ApproveState.Valid);
			approveTransferInfo.save(po);
		} else if (type.equals("���ⵥ")) {
			ArrayList<StoreoutorderPO> arrayList = ApproveWarehouse_outInfo
					.get();
			StoreoutorderPO po = arrayList.get(num);
			po.setCheck_state(ApproveState.Valid);
			ApproveWarehouse_outInfo.save(po);
		} else if (type.equals("���")) {
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
