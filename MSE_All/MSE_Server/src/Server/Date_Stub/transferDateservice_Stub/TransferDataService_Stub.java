package Server.Date_Stub.transferDateservice_Stub;

import java.rmi.RemoteException;

import PO.ChangeorderPO;
import Server.dataservice.transferdataservice.TransferDataService;

public class TransferDataService_Stub implements TransferDataService{

	//�����ݿ��в���һ����ת��PO
	@Override
	public void insert(ChangeorderPO cp) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("�½��ɹ�");
	}

}
