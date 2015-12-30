package nju.edu.businesslogic.storebl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.swing.event.TreeWillExpandListener;

import nju.edu.RMI_init.RMIHelper;
import nju.edu.businesslogicservice.storeblservice.Inventory_managementInfo;
import nju.edu.businesslogicservice.storeblservice.StoreinUpdateInfo;
import nju.edu.businesslogicservice.transferblservice.StoreinInfo;
import nju.edu.dataservice.storedataservice.StoreMessageDataService;
import PO.StorePO;
import PO.StoreinorderPO;
import StaticValue.StoreNum;

public class StoreMessageBL implements StoreinUpdateInfo, StoreinInfo,
		 Inventory_managementInfo, Runnable {

	private static StoreMessageBL store_message = null;
	private StorePO sp;
	private double Strorage_time; // ���ʱ�䣨min��
	private String num;  //�ֿ�������ת���ı��

	private StoreMessageBL(String transferNum) {
		init(transferNum);
	}
	private StoreMessageBL() {
		init(num);
	}
	public static StoreMessageBL getInstance() {
        
		if (store_message == null) {
			store_message = new StoreMessageBL();

		}
		return store_message;
	}
	
	public static StoreMessageBL getInstance(String transferNum) {
          
		if (store_message == null) {
			store_message = new StoreMessageBL(transferNum);

		}
		return store_message;
	}

	private void init(String transferNum) {
		StoreMessageDataService smd = RMIHelper.getStoreMessageData();
		try {
			sp = smd.getStoreMessage(transferNum);
		} catch (RemoteException e) {
			sp = null;
			e.printStackTrace();
		}
		num=transferNum;
		Strorage_time = getFromFile();
		Thread t = new Thread(this);
		t.start();
	}

	// �����µĿ����Ϣ�����ļ��б���
	public void save() {
		StoreMessageDataService smd = RMIHelper.getStoreMessageData();
		try {
			smd.saveStoreMessage(sp,num);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

	// ���ļ��ж�ȡ���ʱ��
	private double getFromFile() {
		String time = new String();
		File file = new File("clientFile/storageTime.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			time = reader.readLine();
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Double.parseDouble(time);
	}

	// �����ļ��еļ��ʱ��
	private void setToFile(double new_time) {
		String s = "" + new_time;
		try {
			FileWriter writer = new FileWriter(new File(
					"clientFile/storageTime.txt"));
			writer.write(s);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// ���ʱ���¿����Ϣ

	@Override
	public void storein_update(String qu, int pai, int jia, int wei,
			String orderNum) {
		sp.update(qu, pai - 1, jia - 1, wei - 1, orderNum);
	}

	// ���ݿ�λ���Ҷ�Ӧλ�õĶ������
	@Override
	public ArrayList<String> getId(String qu, int pai, int[] jia) {
		return sp.getId(qu, pai - 1, jia);
	}

	// ���ݿ�λ���Ҷ�Ӧλ�õĶ������
	@Override
	public ArrayList<String> getId(int jia, int[] wei) {
		return sp.getId(jia - 1, wei);
	}

	// �õ��������λ�õĿ�����
	@Override
	public String[][] getStoreRatio() {
		return sp.getStoreRatio();
	}

	// �õ���ǰ����ֵ
	@Override
	public String getWarnData() {
		return sp.getWarn_value();
	}

	// ���þ���ֵ
	@Override
	public void setWarnData(String warnData) {
		sp.setWarn_value(warnData);

	}

	// �õ�ָ�����������ֵ
	@Override
	public String getRemindData(int area) {
		String[] remindData = sp.getRemind_value();
		return remindData[area];
	}

	// ����ָ�����������ֵ
	@Override
	public void setRemindData(int area, String RemindData) {
		String[] remindData = sp.getRemind_value();
		remindData[area] = RemindData;
		sp.setRemind_value(remindData);
	}

	// ��������õ����ж�����
	@Override
	public ArrayList<String> getOrderList(String qu) {
		return sp.getId(qu);
	}

	// �õ��洢�ļ��ʱ��
	public double getIntervalTime() {
		return Strorage_time;
	}

	// ���´洢�ļ��ʱ��
	public void setIntervalTime(double new_time) {
		this.Strorage_time = new_time;
		setToFile(new_time);

	}

	//�õ���ͬ�����Ӧ�ĵ����
	public String[][] getArriveAddress(){
		String[] name=StoreNum.getStoreName(num);
		int length=name.length;
		String[][] message=new String[length][2];
        String[] qu={"������","������","������"};
		
		for (int i = 0; i < length; i++) {
              message[i][0]=(i/3)>2?("������4��"+(i-8)+"��"):(qu[i/3]+(i%3+1)+"��");
              message[i][1]=name[i];

		}		
		return message;
	}
	
	@Override
	public void run() {
		while (store_message != null) {
			try {
				Thread.sleep((long) Strorage_time * 60 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			save();
			System.out.println("�����Ϣ�Զ�������ϣ�");
		}

	}

}
