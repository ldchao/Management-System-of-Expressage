package Client.businesslogicservice.transferblservice;

import PO.ChangeorderPO;

public interface TransferBLService {
	
	//������ת��
	public void build(int[][][][] location,String car_number,String monitor);
	
	//�����ֵ�ﵽ����ֵʱ��������
	 public void setRemind(int qu,int pai,int jia);
	 
	 //�鿴��Ϣ����
	 public String checkRemind();
	 
	 //�洢��ת��
	 public void save(ChangeorderPO cp);
}
