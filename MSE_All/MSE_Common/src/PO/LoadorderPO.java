package PO;
import java.io.Serializable;
import java.util.ArrayList;

public class LoadorderPO implements Serializable{
	String date;    //װ������
	String loadorderNum;  //װ�˵����
	String transferNum;     //��ת���ı�Ż�Ӫҵ�����
	String arriveNum;      //����ر��
	String monitorName;   //��װԱ����
	String transferName;   //Ѻ��Ա����
	String transportNum;   //�����ţ����˱�ţ����˱�ţ����˱�ţ�
	ArrayList<String> order; //���ж������
	double fee;   //�˷�
	int checkState;//����״̬

	public LoadorderPO(String date,String offNum,String transferNum,String arriveNum,String monitorName,String transferName,String transportNum,ArrayList<String> order,double fee,int checkState){
		super();
		this.date = date;
		this.loadorderNum = offNum;
		this.transferNum = transferNum;
		this.arriveNum = arriveNum;
		this.monitorName = monitorName;
		this.transferName = transferName;
		this.transportNum = transportNum;
		this.order = order;
		this.fee = fee;
		this.checkState = checkState;
	}

	public String getDate(){
		return date;
	}

	public String getLoadorderNum(){
		return loadorderNum;
	}

	public String getTransferNum(){
		return transferNum;
	}

	public String getArriveNum(){
		return arriveNum;
	}

	public String getMonitorName(){
		return monitorName;
	}

	public String getTransferName(){
		return transferName;
	}

	public String getTransportNum(){
		return transportNum;
	}

	public ArrayList<String> getOrder(){
		return order;
	}

	public double getFee(){
		return fee;
	}

	public int getCheckState(){
		return checkState;
	}



}
