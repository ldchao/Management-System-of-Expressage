package Client.BL_Stub.transferBLService_Stub;

import Client.PO.ChangeorderPO;
import Client.businesslogicservice.transferblservice.TransferBLService;

public class TransferBLService_Stub implements TransferBLService{

	
	int qu;
	int pai;
	int jia;
	String remind;
	String numberOfTransferStation;
	
	
	//������ת���ı��
	public TransferBLService_Stub(String numberOfTransferStation) {
		super();
		this.numberOfTransferStation = numberOfTransferStation;
	}

	//������ת��
	@Override
	public void build(int[][][][] location, String car_number, String monitor) {
		// TODO Auto-generated method stub
		System.out.println("�½�һ����ת��");
		
	}

	//�����ֵ�ﵽ����ֵʱ��������
	@Override
	public void setRemind(int qu, int pai, int jia) {
		// TODO Auto-generated method stub
		
		this.qu=qu;
		this.pai=pai;
		this.jia=jia;
		
	}

	//�鿴��Ϣ����
	@Override
	public String checkRemind() {
		// TODO Auto-generated method stub
		
		return remind;
	}

	//�洢��ת��
	@Override
	public void save(ChangeorderPO cp) {
		// TODO Auto-generated method stub
		System.out.println("�洢һ�ŵ�");
	}
	
	

}