package nju.edu.businesslogic.transferbl;

import java.rmi.RemoteException;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.VO.ReceiFormVO;
import nju.edu.businesslogicservice.transferblservice.ReceiFormBlService;
import nju.edu.dataservice.transferdataservice.ReceiFormDataService;
import PO.ReceiveorderPO;
import State.ApproveState;
import State.ArriveState;

public class ReceiFormBL implements ReceiFormBlService{
	//�½����յ�
	@Override
	public void addReceiveOrder(ReceiFormVO rv) {
		ReceiveorderPO PO = new ReceiveorderPO(rv.getData(),
				rv.getDepartPlace(), rv.getArrivePlace(), getState(rv.getArrive_state()),rv.getOrderNum(),
				ApproveState.NotApprove);
		ReceiFormDataService receiFormdata = RMIHelper.getReceiFormData();
		try {
			receiFormdata.insert(PO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		System.out.println("���յ����ύ�ܾ�������");
	}
	//������յ�
	@Override
	public void save(ReceiveorderPO rp) {
		ReceiFormDataService receiFormdata = RMIHelper.getReceiFormData();
		try {
			receiFormdata.insert(rp);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		System.out.println("�洢����������ĵ��ﵥ");
	}
	//���¶���������Ϣ��˾������װԱ��Ѻ��Ա������״̬��Ϣ
	@Override
	public void update() {
		// TODO Auto-generated method stub
		//��build������rv����
	}

	private ArriveState getState(String s) {
		if (s.equals("��")) {
			return ArriveState.Damaged;
		} else if (s.equals("����")) {
			return ArriveState.Whole;
		} else {
			return ArriveState.Lost;
		}
	}


}
