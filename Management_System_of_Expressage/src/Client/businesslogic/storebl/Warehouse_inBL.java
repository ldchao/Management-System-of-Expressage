package Client.businesslogic.storebl;

import java.util.ArrayList;

import Client.PO.StoreinorderPO;
import Client.VO.ArriverorderVO;
import Client.businesslogic.transferbl.StoreinInfo;
import Client.businesslogicservice.storeblservice.Warehouse_inBLService;

public class Warehouse_inBL implements Warehouse_inBLService,StoreinInfo{
	
	ArrayList<ArriverorderVO> needinstore=new ArrayList<ArriverorderVO>();
	
	//�½�һ����ⵥ
	@Override
	public void build(ArriverorderVO av, int jia, int wei) {
		// TODO Auto-generated method stub
		System.out.println("�½�һ����ⵥ");
	}

	//���ｨ�����ﵥ����������ֵ
	@Override
	public void setRemind(ArriverorderVO av) {
		// TODO Auto-generated method stub
		needinstore.add(av);
	}

	//��������
	@Override
	public ArrayList<ArriverorderVO> checkRemind() {
		// TODO Auto-generated method stub
		return needinstore;
	}

	//�洢�½�������ⵥ
	@Override
	public void save(StoreinorderPO sp) {
		// TODO Auto-generated method stub
		System.out.println("�洢��ⵥ");
	}

	////���ݿ�λ�õ���Ӧλ�õĶ������
	@Override
	public ArrayList<String> getId(int[][][][] location) {
		// TODO Auto-generated method stub
		ArrayList<String> Idlist=new ArrayList<String> ();
		
		return Idlist;
	}

}
